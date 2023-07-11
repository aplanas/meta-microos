SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.17.0"

RPM_NAME = "python310-bitstruct-8.17.0-1.3.aarch64.rpm"
RPM_HASH = "c600ce50f08b6c698a1c7661ceca904dbd059fdea911fd37d5b5b3074a59a5328a87917627680ccbb4c2d52aa7b833e0b9cfad770e6666153b1a05f49c03470a"

RPROVIDES:${PN} += "python3.10dist-bitstruct \
python310-bitstruct \
python3dist-bitstruct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
