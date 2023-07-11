SUMMARY = "Development files for libgtop"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-devel-2.40.0-4.4.aarch64.rpm"
RPM_HASH = "cad2e7a53ba8c79c8cebf93ab4087f44a5c15d546fbea8cfdae26c5a42c2bb6ce20d04764417aa4d1fb1c4fc0f096fbdb00db6aca07463fe4e2359b6eeb754a7"

RPROVIDES:${PN} += "libgtop-devel \
pkgconfig-libgtop-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgtop-2-0-11 \
pkgconfig-glib-2.0 \
typelib-1-0-GTop-2-0"

inherit rpm
