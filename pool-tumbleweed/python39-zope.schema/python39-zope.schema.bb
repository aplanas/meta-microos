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

RPM_NAME = "python39-zope.schema-7.0.1-2.1.noarch.rpm"
RPM_HASH = "47011771dfd2448494dd4b12a93f7e90e7945b90094eb6f0f99cd1618840e452bc1f8ca60cb8bb7d0ddaac42beb3870ddd0974f94aa7bfe2248ac1e9cbd63f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.schema \
python39-zope.schema \
python3dist-zope.schema"

RDEPENDS:${PN} += "python-abi \
python39-zope.event \
python39-zope.interface"

inherit rpm
