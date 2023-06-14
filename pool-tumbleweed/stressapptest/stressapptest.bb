SUMMARY = "Stressful application test"
DESCRIPTION = "Stressful Application Test (or stressapptest, its unix name) tries to maximize \
randomized traffic to memory from processor and I/O, with the intent of \
creating a realistic high load situation in order to test the existing \
hardware devices in a computer."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "stressapptest-1.0.9-3.1.aarch64.rpm"
RPM_HASH = "315057e28046c64ed117bf84829f7e6593b2b5f3ec94e45139d070a8b2acd7a8f824260304ed1121879ade8c5156637c77efb36807850c9f8e28150812213263"

RPROVIDES:${PN} += "stressapptest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
