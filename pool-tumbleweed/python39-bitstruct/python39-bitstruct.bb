SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.17.0"

RPM_NAME = "python39-bitstruct-8.17.0-1.1.aarch64.rpm"
RPM_HASH = "e10d7a943786bf48e138434bedc28635c10308ece3acad95dda14fc24d0cd3bfe61cbbfbdb758ad7e847d72581e03aa89ed4c893c4c0d004e24857d78517e709"

RPROVIDES:${PN} += "python3.9dist(bitstruct) \
python39-bitstruct \
python39-bitstruct(aarch-64) \
python3dist(bitstruct)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
