SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-python-snappy-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "9424f16b7d22578b9b42b1b4b226672a3c28dc1a988013c8d70954afc5b767379dfdc02aaed174ea1b984f518041268f36f70f5c785db36ad22295db86f6e57a"

RPROVIDES:${PN} += "python3.9dist(python-snappy) \
python39-python-snappy \
python39-python-snappy(aarch-64) \
python3dist(python-snappy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsnappy.so.1()(64bit) \
python(abi)"

inherit rpm
