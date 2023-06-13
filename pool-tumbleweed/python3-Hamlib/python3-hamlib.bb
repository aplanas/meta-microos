SUMMARY = "Python 3 bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "python3-Hamlib-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "87acc34af5358eb4508defefd7c05456822adbf59880b9b49d43a3cf64237db52504ad234a57af6f493469e8012f0204c04dbad88a837b03580ba2374d41750d"

RPROVIDES:${PN} += "python3-Hamlib \
python3-Hamlib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhamlib.so.4()(64bit) \
libpython3.10.so.1.0()(64bit) \
python(abi)"

inherit rpm
