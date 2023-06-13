SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.16.4"

RPM_NAME = "python310-pywlroots-0.16.4-1.1.aarch64.rpm"
RPM_HASH = "6913fc4c07ad54bcd675deb154f63a15deaa0f43a8a59ac0fd5545f00cc1c8893c364de3369f463f6577e67de1fd031c485bd28200b730823d1a66d7178c81ae"

RPROVIDES:${PN} += "python3-pywlroots \
python3.10dist(pywlroots) \
python310-pywlroots \
python310-pywlroots(aarch-64) \
python3dist(pywlroots)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libwlroots.so.11()(64bit) \
python(abi) \
python310-pywayland \
python310-xkbcommon"

inherit rpm
