SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python310-Logbook-1.5.3-5.1.aarch64.rpm"
RPM_HASH = "e80f5fdbf09080897273db64e2811be9cc0af96bd0e29aac135688c5233a7f61cdb94cc6aa82498ab41afe13a48c02f00b78182a79f0d84372b53afae4e1b143"

RPROVIDES:${PN} += "python3.10dist-logbook \
python310-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
