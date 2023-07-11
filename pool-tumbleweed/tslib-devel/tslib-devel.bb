SUMMARY = "Development files for tslib, a touchscreen panel event layer"
DESCRIPTION = "Devel package for tslib. Tslib is an abstraction layer for touchscreen panel events."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "tslib-devel-1.22-1.10.aarch64.rpm"
RPM_HASH = "4716653ae941831aca40b169a41429eb9af65a399c4596c9ddda13b82cae940d99acaf5cbe07f86eb87895fdd89e1aad89e352a9e81d071d95ebae1d1d766eda"

RPROVIDES:${PN} += "pkgconfig-tslib \
tslib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
tslib \
tslib-plugins"

inherit rpm
