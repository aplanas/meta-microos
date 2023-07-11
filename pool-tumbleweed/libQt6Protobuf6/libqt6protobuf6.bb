SUMMARY = "Qt 6 Protobuf library"
DESCRIPTION = "The Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Protobuf6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2d4132c3433584384615c97c957286ae085645cfdc39c4769f45028017d7ed543ecf6be0761c0506411ffee1306e8cf4696c98a8cf935c4070b53398720bb088"

RPROVIDES:${PN} += "libQt6Protobuf.so.6 \
libQt6Protobuf6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
