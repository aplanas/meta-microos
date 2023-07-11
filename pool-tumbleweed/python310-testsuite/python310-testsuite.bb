SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-testsuite-3.10.12-1.2.aarch64.rpm"
RPM_HASH = "86a603c62adb1f3968fc5fc206711e94420b0005dc0f6c2977822c03d21b2b27f02baee4a606988cea7f65789c84919e6dba2a8366889c8e0b6f50ab35c1b65d"

RPROVIDES:${PN} += "python310-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python310 \
python310-tk"

inherit rpm
