SUMMARY = "Realtime Kernel Testsuite"
DESCRIPTION = "The Realtime Kernel Testsuite measures real-time attributes of the kernel, \
specifically timer and signal latency and the functionality of Priority \
Inheritance Mutexes."
LICENSE = "GPL-2.0-only"

PV = "2.5"

RPM_NAME = "rt-tests-2.5-1.2.aarch64.rpm"
RPM_HASH = "d805e078e6cf20e8cf454af717faa63a14e9f2a8cbcd77103ed79306e13d002335dc100b9dfa0ca30a78b3b709f935f262e4fff7767bacd48c364966c90d0854"

RPROVIDES:${PN} += "rt-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1 \
python-abi"

inherit rpm
