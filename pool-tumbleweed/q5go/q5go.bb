SUMMARY = "A Go board including an editor and analysis frontend"
DESCRIPTION = "q5Go is a tool for Go players which performs the following functions: \
 \
 * SGF editor \
 * Analysis frontend for Leela Zero (or compatible engines) \
 * GTP interface \
 * IGS client \
 * Export to a variety of formats"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.3"

RPM_NAME = "q5go-2.1.3-1.5.aarch64.rpm"
RPM_HASH = "e6fb6a48b6788439e09ebc3ce818b8d6203cbe9834d362d83aa450c8a3b179602e53fa7ee0b9d4431a078cb2a8ece2cb4ad9d081a7a1f3b7030acae82d9b1957"

RPROVIDES:${PN} += "q5go"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
