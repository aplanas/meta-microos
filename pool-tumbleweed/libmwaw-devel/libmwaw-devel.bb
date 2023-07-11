SUMMARY = "Files for Developing with libmwaw"
DESCRIPTION = "Libmwaw is a new project for converting many pre-OSX MAC text formats. \
This package contains the libmwaw development files."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-devel-0.3.21-2.10.aarch64.rpm"
RPM_HASH = "5035230280b46acc216112150fce549fdcc318578e5855a33d240d6cbcbb6ae8158230998b4c3c513616c249c5a3486c90f178e1f15f5c03cc4632eeb28f2b26"

RPROVIDES:${PN} += "libmwaw-devel \
pkgconfig-libmwaw-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmwaw-0-3-3 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
