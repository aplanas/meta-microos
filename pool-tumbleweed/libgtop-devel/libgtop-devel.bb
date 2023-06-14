SUMMARY = "Development files for libgtop"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-devel-2.40.0-4.3.aarch64.rpm"
RPM_HASH = "1570877bc2db5156b1b24cc286ab330233f87982e07f4306253986902273be01ffea63f0f88a47ee4e987923d602cd311937fda2346ae904137fdea784852d73"

RPROVIDES:${PN} += "libgtop-devel \
pkgconfig-libgtop-2.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libgtop-2-0-11 \
pkgconfig-glib-2.0 \
typelib-1-0-GTop-2-0"

inherit rpm
