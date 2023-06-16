SUMMARY = "Realtime Kernel Testsuite"
DESCRIPTION = "The Realtime Kernel Testsuite measures real-time attributes of the kernel, \
specifically timer and signal latency and the functionality of Priority \
Inheritance Mutexes."
LICENSE = "GPL-2.0-only"

PV = "2.5"

RPM_NAME = "rt-tests-2.5-1.1.aarch64.rpm"
RPM_HASH = "d52e0b96484a8b52cd3565268945ce257d41a53d3b10aa1a89290ea3da75f0ece228a9b8bc34253937dff4a89a3c07a340a20d8dcdbd05bf8297d8cd1316c434"

RPROVIDES:${PN} += "rt-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1 \
python-abi"

inherit rpm
