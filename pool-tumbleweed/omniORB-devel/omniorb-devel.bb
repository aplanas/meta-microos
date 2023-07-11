SUMMARY = "Development libraries, header files and utilities for omniORB"
DESCRIPTION = "omniORB-devel contains the omniORB development files. These \
files are needed to develop applications based on omniORB."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORB-devel-4.3.0-2.8.aarch64.rpm"
RPM_HASH = "4a3515590049ab8fd78eb857679be74a61c9d8e5df137e286a1e1595c75f0e35a6609eb407856afbc8e06396b3513b5e5eccb5d0a9d80577dc8a00ec80c5d99a"

RPROVIDES:${PN} += "omniORB-devel \
pkgconfig-omniCOS4 \
pkgconfig-omniCOSDynamic4 \
pkgconfig-omniConnectionMgmt4 \
pkgconfig-omniDynamic4 \
pkgconfig-omniORB4 \
pkgconfig-omniZIOP4 \
pkgconfig-omniZIOPDynamic4 \
pkgconfig-omnithread3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomniORB4-3 \
libomnithread4 \
omniORB \
pkgconfig-omniCOS4 \
pkgconfig-omniORB4 \
pkgconfig-omniZIOP4 \
pkgconfig-omnithread3"

inherit rpm
