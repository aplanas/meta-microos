SUMMARY = "Common build files of the GNOME C++ bindings"
DESCRIPTION = "The mm-common module provides the build infrastructure and utilities \
shared among the GNOME C++ binding libraries.  It is a required dependency \
to build glibmm and gtkmm from git."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "mm-common-1.0.4-1.5.noarch.rpm"
RPM_HASH = "d88eef1f83645154ce4ebca19787b3427c12f435602f73214591eee3c94c893a8b28b84a95d455ed7830b5057a2e3c0fceaacaf3727c9c1a49c459f78f19233c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm-common \
pkgconfig(mm-common-libstdc++) \
pkgconfig(mm-common-util)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/pkg-config"

inherit rpm
