SUMMARY = "Tools that make use of libpaper"
DESCRIPTION = "This package provides the 'paper' binary"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libpaper-tools-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "1ef0d23804753de196c0332d8b770bf73c353478a2a9f94cfc887496068c30dd3669edef85da6cb45df7968567f76be7c3d0d36a423724104f488ceb511c0a9a"

RPROVIDES:${PN} += "libpaper-tools \
libpaper-utils \
paper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpaper.so.2"

inherit rpm
