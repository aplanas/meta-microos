SUMMARY = "Zope interface extension for defining data schemas"
DESCRIPTION = "Schemas extend the notion of interfaces to detailed descriptions of \
Attributes (but not methods).  Every schema is an interface and \
specifies the public fields of an object.  A *field* roughly \
corresponds to an attribute of a Python object.  But a Field provides \
space for at least a title and a description.  It can also constrain \
its value and provide a validation method.  Besides you can optionally \
specify characteristics such as its value being read-only or not \
required."
LICENSE = "ZPL-2.1"

PV = "7.0.1"

RPM_NAME = "python311-zope.schema-7.0.1-2.3.noarch.rpm"
RPM_HASH = "1d51681a5fa55fea350a65c7681c0ad26d588ac963c90097fff71141e8e8e8f95fc92989b4413b8ecc712cedc05e45d6040882fe28ac10ef2896f7f16fbc614f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.schema \
python3.11dist-zope.schema \
python311-zope.schema \
python3dist-zope.schema"

RDEPENDS:${PN} += "python-abi \
python311-zope.event \
python311-zope.interface"

inherit rpm
