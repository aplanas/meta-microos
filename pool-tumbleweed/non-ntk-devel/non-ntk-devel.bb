SUMMARY = "Development files for non-ntk"
DESCRIPTION = "This package contains development files for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-devel-1.3.1001-1.6.aarch64.rpm"
RPM_HASH = "f91d1cc7238e207cfb0cc5259b79263ce1b971eda854a1121b5ec5f87f728cf38ed6304bd5871c2994f67726681c043dc2b9dd91a25cc08105b692d29ccf0745"

RPROVIDES:${PN} += "non-ntk-devel \
non-ntk-devel(aarch-64) \
pkgconfig(ntk) \
pkgconfig(ntk_gl) \
pkgconfig(ntk_images)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntk1 \
pkgconfig(cairo) \
pkgconfig(gl) \
pkgconfig(x11) \
pkgconfig(xft)"

inherit rpm
