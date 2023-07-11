SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.17.0"

RPM_NAME = "python39-bitstruct-8.17.0-1.3.aarch64.rpm"
RPM_HASH = "e4218968db09c190c8a6c95d059e430c6ab706d5cda1c0c395cbf0e649ac84f42ed3acbc2ff447ac79c7e3405fbd7e20be6726a3a308758d79ae9ec847baee7b"

RPROVIDES:${PN} += "python3.9dist-bitstruct \
python39-bitstruct \
python3dist-bitstruct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
