SUMMARY = "Development files for cups-filters"
DESCRIPTION = "This package contains the development files for cups-filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.15"

RPM_NAME = "cups-filters-devel-1.28.15-3.1.aarch64.rpm"
RPM_HASH = "af47dbd3c39fd0fba6cc75e70d4588739774c2f5f3456a7f42a3e79cdf2c68f1a7dbd14aa87355e6c371c4e0da674a309306380bc618eb12ebb39c89760dd1d7"

RPROVIDES:${PN} += "cups-filters-devel \
pkgconfig-libcupsfilters \
pkgconfig-libfontembed"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups-filters"

inherit rpm
