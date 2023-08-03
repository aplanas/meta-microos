SUMMARY = "Development files for libappmenu-gtk2-parser"
DESCRIPTION = "This package contains development-files for libappmenu-gtk2-parser."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk2-parser-devel-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "2541ca5e7d7cced5c3f47eb11c6ed91aaa06db9690735c3db7ae4908df172f7eb80d6593a76d42f6505c4925954cb86d12831cb9a596ef49427a2c2ecf80b321"

RPROVIDES:${PN} += "libappmenu-gtk2-parser-devel \
pkgconfig-appmenu-gtk2-parser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappmenu-gtk-parser-devel \
libappmenu-gtk2-parser0 \
pkgconfig-gtk+-2.0"

inherit rpm
