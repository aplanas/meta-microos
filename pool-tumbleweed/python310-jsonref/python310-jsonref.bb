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

RPM_NAME = "python310-jsonref-0.2-1.16.noarch.rpm"
RPM_HASH = "2c152e756f80ba0b80fe9019c7789013974274626d13e8b73193d91b12d4178418a917004dd10576890af540b010de73d7cf4653149c9be3bf8bd4b420bf7ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonref \
python310-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
