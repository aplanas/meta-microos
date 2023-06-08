SUMMARY = "Development Files for exo"
DESCRIPTION = "This package contains development files needed for developing applications \
based on exo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.0"

RPM_NAME = "exo-devel-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "bbaf2fbcdd0788f42d7a1321b4850b84cba0a512f28a25604a050b878360b74dac05715e1f43faac2b7d485ec377dfce28ac84423dbe3f1516ea5304fa696b2b"

RPROVIDES:${PN} += "exo-devel exo-devel(aarch-64) pkgconfig(exo-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config exo-tools libexo-2-0 pkgconfig(gtk+-3.0) pkgconfig(libxfce4util-1.0)"

inherit rpm
