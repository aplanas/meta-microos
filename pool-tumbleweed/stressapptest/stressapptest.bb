SUMMARY = "Stressful application test"
DESCRIPTION = "Stressful Application Test (or stressapptest, its unix name) tries to maximize \
randomized traffic to memory from processor and I/O, with the intent of \
creating a realistic high load situation in order to test the existing \
hardware devices in a computer."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "stressapptest-1.0.9-3.2.aarch64.rpm"
RPM_HASH = "1c96b7ca01cddb7bc782d100479727773db30eb7449d5f6174dd6a25a0d986f0bc15cd143b897c43a8ce9fce78fe8fdb7a14184dcc9424f9e8fd2f7f3fbad7bf"

RPROVIDES:${PN} += "stressapptest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
