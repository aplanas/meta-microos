SUMMARY = "Platform support library used by libCEC development files"
DESCRIPTION = "Development files for platform support library used by libCEC and Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0.1"

RPM_NAME = "p8-platform-devel-2.1.0.1-3.14.aarch64.rpm"
RPM_HASH = "799297ee783d0be4db9fa6410547ab53ff5af0ac25fa251bfc10dc6c6ea5e6d38e160fb73d3079f4a5aa9c2a8b1effae74bbf435ad756ee7489d38768530a93b"

RPROVIDES:${PN} += "p8-platform-devel \
pkgconfig-p8-platform"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp8-platform2"

inherit rpm
