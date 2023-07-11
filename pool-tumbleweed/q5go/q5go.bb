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

RPM_NAME = "q5go-2.1.3-1.6.aarch64.rpm"
RPM_HASH = "6254f63ca02e111b01e384d9980a3328f4ed6b290f344cfe28d09c4ed8a5d51bfe5f95075cc0f94abd5a0c720588d57818eba9ff105b9894f256b3a25202c972"

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
