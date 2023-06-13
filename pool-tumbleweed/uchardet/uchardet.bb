SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "uchardet-0.0.8-1.3.aarch64.rpm"
RPM_HASH = "0e5da552282d1564cccc9d19f997d989edebf3ebb80054ca0892e3f92f878b14a5b70b2f93e103abc1e649224ebaf2fba74a7653bc495e5ddee392536a057e12"

RPROVIDES:${PN} += "uchardet \
uchardet(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libuchardet.so.0()(64bit)"

inherit rpm
