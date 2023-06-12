SUMMARY = "Development Headers, Documentation, and Libraries for Pidgin"
DESCRIPTION = "The pidgin-devel package contains the header files, developer \
documentation, and libraries required for development of Pidgin scripts \
and plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "pidgin-devel-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "3ca4f1482bfc2c08683d22f40c8b6322583ea65966a450504d7e06b6b4293fadacc637f3d870494bb1b1ec655a065898f127f7841e1daa64d1d1f96008043e52"

RPROVIDES:${PN} += "pidgin-devel \
pidgin-devel(aarch-64) \
pkgconfig(pidgin)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpurple-devel \
pidgin \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-2.0) \
pkgconfig(purple)"

inherit rpm
