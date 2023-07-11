SUMMARY = "Development package for dtkwm"
DESCRIPTION = "Header files and libraries for dtkwm."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.12"

RPM_NAME = "dtkwm-devel-2.0.12-2.11.aarch64.rpm"
RPM_HASH = "b98629ee570f5598572e9fd5aa279a1b0e5cc164039a9fe3a35ce1c376adac81626c682d45457f6c69610e944760ee8d9687cffdbf96ff9cd060b51105d6946d"

RPROVIDES:${PN} += "cmake-DtkWm \
dtkwm-devel \
pkgconfig-dtkwm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdtkwm5 \
pkgconfig-dtkcore"

inherit rpm
