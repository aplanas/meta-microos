SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-python-snappy-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "26fafcf5d55ef81321e5a5ec78facf6137294c011284f1eee4330cc7bae575db3935c3e2c077b1724ff38770cdd0b3fb03f38f6eff577f9de7157f9f6d291d87"

RPROVIDES:${PN} += "python3.11dist(python-snappy) \
python311-python-snappy \
python311-python-snappy(aarch-64) \
python3dist(python-snappy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsnappy.so.1()(64bit) \
python(abi)"

inherit rpm
