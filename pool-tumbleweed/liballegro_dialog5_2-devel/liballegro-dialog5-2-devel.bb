SUMMARY = "Development files for liballegro_dialog"
DESCRIPTION = "Development files needed to build applications which use liballegro_dialog."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_dialog5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "88ebc3db7bc06378a3215241724eabfe0558238ab1a387d1e5eec422e5346dbc8432b3df58b60ca3d572f5818f58af726e44c758db285dc7beebd003efa99fea"

RPROVIDES:${PN} += "liballegro-dialog5-2-devel \
pkgconfig-allegro-dialog-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-dialog5-2 \
pkgconfig-allegro-5"

inherit rpm
