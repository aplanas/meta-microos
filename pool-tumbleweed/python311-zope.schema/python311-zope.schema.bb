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

RPM_NAME = "python311-zope.schema-7.0.1-2.1.noarch.rpm"
RPM_HASH = "28cf8fc3a01a2e9891c6ccaa0b9df13b1dfbe4bef78fe4497278dcf7887ef00a5679d6b6e6075fabd61b2aef90333fc73985eee2d3e61691b65e9215e89be757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.schema) \
python311-zope.schema \
python3dist(zope.schema)"

RDEPENDS:${PN} += "python(abi) \
python311-zope.event \
python311-zope.interface"

inherit rpm
