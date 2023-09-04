SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python39-Logbook-1.5.3-5.1.aarch64.rpm"
RPM_HASH = "34cc2825501825025eef0fa66b5545048fe66f0102d9f887ca3c7f2ea3ce631803a9336190e9a871e476a950706e7f173f5f6c7e2c31ceffc91b65879b4e64fe"

RPROVIDES:${PN} += "python3.9dist-logbook \
python39-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
