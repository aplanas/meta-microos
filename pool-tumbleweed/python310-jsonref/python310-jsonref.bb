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

RPM_NAME = "python310-jsonref-0.2-1.14.noarch.rpm"
RPM_HASH = "a116b3a9072dc9e832b095d4ea636642c5ec984b4d7db0db4baa51dc885c885fc487d83c0312d509f614835a4a6bd79eb1b127133bfb7d57dceff6c3c9260036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonref \
python3.10dist-jsonref \
python310-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
