SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.17.0"

RPM_NAME = "python311-bitstruct-8.17.0-1.1.aarch64.rpm"
RPM_HASH = "88b9c9e9588fcc0f8bdf3ecf9d3eba1687b1d0fbcf27235eddbc5302fe3b6e8718b6119469d62f69e708805105166d0a11e7d5d138ff0657132919b6feb48bb5"

RPROVIDES:${PN} += "python3.11dist(bitstruct) \
python311-bitstruct \
python311-bitstruct(aarch-64) \
python3dist(bitstruct)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
