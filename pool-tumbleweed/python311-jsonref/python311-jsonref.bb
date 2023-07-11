SUMMARY = "An implementation of JSON Reference for Python"
DESCRIPTION = "jsonref is a library for automatic dereferencing of JSON Reference \
objects for Python (supporting 2.6+ including Python 3). \
 \
This library lets you use a data structure with JSON reference objects, as if \
the references had been replaced with the referent data. \
 \
Features \
* References are evaluated lazily. Nothing is dereferenced until it is used. \
* Recursive references are supported, and create recursive python data \
  structures. \
References objects are actually replaced by lazy lookup proxy objects which are \
almost completely transparent. \
Complete docs can be found at http://jsonref.readthedocs.org/"
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python311-jsonref-0.2-1.16.noarch.rpm"
RPM_HASH = "178c0419fa84ce121c8be9d051ac51f1c948630cc74525aca73da9cde3fd379f1709f3f0dd419caa8f26ad2d40653306180cd8c23e8b856aac20c429a54930ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonref \
python3.11dist-jsonref \
python311-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
