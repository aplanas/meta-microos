SUMMARY = "Library for reading/writing quicktime movie files"
DESCRIPTION = "library for reading/writing quicktime movie files, based on and forked \
from quicktime4linux"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-devel-1.2.4+git20180804.fff99cd-4.2.aarch64.rpm"
RPM_HASH = "af36cd0ece69d154be9ba02c1ad061fb3b6fb35ea71d1cf23393cc9337efd2a9c0649ee71b6acdf68372b8cd651f5a89e2cf84e9c6f8c38f80d786b4527cfe30"

RPROVIDES:${PN} += "libquicktime-devel \
pkgconfig-libquicktime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquicktime \
libquicktime0"

inherit rpm
