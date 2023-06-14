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

RPM_NAME = "python311-jsonref-0.2-1.14.noarch.rpm"
RPM_HASH = "020572e0a78376730852787211313aa1ac0964538f6c54931cf36f67f70fb253afcf950dc8b642bb4d4e7723273c60e32baeac0a05882a4883a5c5a3c2d2f65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jsonref \
python311-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
