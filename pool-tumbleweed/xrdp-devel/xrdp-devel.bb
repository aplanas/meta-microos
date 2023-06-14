SUMMARY = "Development files for xrdp"
DESCRIPTION = "This package contains the development headers for xrdp."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "xrdp-devel-0.9.20-7.3.aarch64.rpm"
RPM_HASH = "936678458eb374a2f28b611200991cd0e0cde2ee76415fc77eb882aa3ba97a2a1baa714b294ae61cab38d606ac200e4ff2641cd0791491ba4aec1fd98692b0cf"

RPROVIDES:${PN} += "pkgconfig-libpainter \
pkgconfig-rfxcodec \
pkgconfig-xrdp \
xrdp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpainter0 \
librfxencode0"

inherit rpm
