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

RPM_NAME = "python39-jsonref-0.2-1.16.noarch.rpm"
RPM_HASH = "ba12fd70d3f7ba8aada193a20577f203e7b3cdd0d6ad8f2c799fbce7302ebf5c7d4e3ce033660aba84845aba4a0c4dbac1b884179b7d26350a7d942cacbcebbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonref \
python39-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
