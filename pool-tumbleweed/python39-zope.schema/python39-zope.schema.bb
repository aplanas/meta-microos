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

RPM_NAME = "python39-zope.schema-7.0.1-2.3.noarch.rpm"
RPM_HASH = "d3dce9e99a06cbd1302f8ff1f691984a41dd682bfee4eae8003f81d972c5ec504dab98a3955a5eb86b912ebcf4af9c06786a31be90d94658900fb8b664d95f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.schema \
python39-zope.schema \
python3dist-zope.schema"

RDEPENDS:${PN} += "python-abi \
python39-zope.event \
python39-zope.interface"

inherit rpm
