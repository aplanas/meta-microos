SUMMARY = "Development files for libappindicator"
DESCRIPTION = "This package contains the development files for the appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator-devel-12.10.1~bzr20200706.298-2.3.aarch64.rpm"
RPM_HASH = "1fbfa190d1bdaf168efae92d6090fd93f17f8209601934972d2d481ffd129c5c748441c584ef580ae5e2e669f157ce93a7b6ca4dfe936addd5506c75717c2003"

RPROVIDES:${PN} += "libappindicator-devel \
libappindicator-devel(aarch-64) \
pkgconfig(appindicator-0.1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappindicator1 \
pkgconfig(dbusmenu-glib-0.4) \
pkgconfig(gtk+-2.0)"

inherit rpm
