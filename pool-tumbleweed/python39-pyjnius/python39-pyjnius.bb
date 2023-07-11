SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-pyjnius-1.4.2-2.6.aarch64.rpm"
RPM_HASH = "10abb3195f4362477e6deafa9936f6a22e950a039947a0832dd736969137e965238432ef8bab3f4001ae9f1395e8770e323061c169d94dc5b8db883eb95cea29"

RPROVIDES:${PN} += "python3.9dist-pyjnius \
python39-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Cython"

inherit rpm
