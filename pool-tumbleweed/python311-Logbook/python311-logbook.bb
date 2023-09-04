SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python311-Logbook-1.5.3-5.1.aarch64.rpm"
RPM_HASH = "bacdb8e1644c1ea775740127dafe3c2e1ad773618c80520191d3a87322d58406f560a1306ce1801338977b7617a99a19e8122436d5de078a6a83e5d352870c65"

RPROVIDES:${PN} += "python3-Logbook \
python3.11dist-logbook \
python311-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
