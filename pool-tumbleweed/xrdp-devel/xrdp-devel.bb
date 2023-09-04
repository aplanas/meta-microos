SUMMARY = "Development files for xrdp"
DESCRIPTION = "This package contains the development headers for xrdp."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.22.1"

RPM_NAME = "xrdp-devel-0.9.22.1-1.1.aarch64.rpm"
RPM_HASH = "06f1959c762340895ca6a71e71a0fca5b04426ab8b8de27f8a998a2bb152f62d04851235199447532f69191ad822bacedb391bb87e531cf2d075f71af113a9a9"

RPROVIDES:${PN} += "pkgconfig-libpainter \
pkgconfig-rfxcodec \
pkgconfig-xrdp \
xrdp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpainter0 \
librfxencode0"

inherit rpm
