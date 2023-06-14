SUMMARY = "Development files for compiz-emerald"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz. \
 \
This package holds the development files for compiz-emerald."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-devel-0.8.18-2.14.aarch64.rpm"
RPM_HASH = "b01b88c0e8e6080d381c136bdf17d77e76d188fccd7653563f070866f92a9824fbd95e27ad77ba0b60ae08aef25c3034eaa59ece4e87154cdee16bf2fe664289"

RPROVIDES:${PN} += "compiz-emerald-devel \
pkgconfig-emeraldengine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-emerald \
gcc-c++ \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
pkgconfig-libdecoration \
pkgconfig-libwnck-3.0 \
pkgconfig-pangocairo \
pkgconfig-xi \
pkgconfig-xrender"

inherit rpm
