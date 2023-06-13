SUMMARY = "Python 3 bindings for libcomps library"
DESCRIPTION = "This package provides the Python 3 bindings for libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "python3-libcomps-0.1.19-2.3.aarch64.rpm"
RPM_HASH = "b324d07b585dda1ac60acf53f499a26dad99ec2537ed2e6d6fe5d1f10c39ccb1f28c692033f3a57e3aa2728e31611b5a88ef5d9f3155d19098dab806d35f3a11"

RPROVIDES:${PN} += "python3-libcomps \
python3-libcomps(aarch-64) \
python3.10dist(libcomps) \
python3dist(libcomps)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcomps.so.0()(64bit) \
libcomps0(aarch-64) \
libpython3.10.so.1.0()(64bit) \
libz.so.1()(64bit) \
python(abi)"

inherit rpm
