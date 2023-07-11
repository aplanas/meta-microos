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

RPM_NAME = "python310-zope.schema-7.0.1-2.3.noarch.rpm"
RPM_HASH = "f5abda62044709e84931296c225c5e030b3bdcd4cbe3cab3f8dd2b7119030c5f15ac676311772369dc113cdb92dc5d8a5be050c0eb9f352636166dc25250f1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.schema \
python310-zope.schema \
python3dist-zope.schema"

RDEPENDS:${PN} += "python-abi \
python310-zope.event \
python310-zope.interface"

inherit rpm
