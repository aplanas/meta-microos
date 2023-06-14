SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python311-Logbook-1.5.3-3.12.aarch64.rpm"
RPM_HASH = "150ef16fbb7374e77b2358d359f0e7d074b96d076d097090d5527cdf5e7bf58429b092dda6a9abaef16f0a86ba9ed0f45ceb86f404c4d8b14468fe14b97cfe72"

RPROVIDES:${PN} += "python3.11dist-logbook \
python311-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
