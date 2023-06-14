SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python39-Logbook-1.5.3-3.12.aarch64.rpm"
RPM_HASH = "b8047514ecade88fb37cbb8ebd8b9b78b16b08e079ec204fd22bde3bbb21c6eff69e1288a9f26f995009f589d08efd26970763a529089bf2b0b1620785e96fe3"

RPROVIDES:${PN} += "python3.9dist-logbook \
python39-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
