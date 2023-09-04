SUMMARY = "Development package for kdav"
DESCRIPTION = "This package contains development files needed to use kdav in other applications."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kdav-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f6bd3ca103c41bd1ec8a1d7d3db64a65b877eab49aa8573824e8d753628145f2df97739366bb3036be0c5d2397d419c593361ae65629f8ff18fc94d67d4362f9"

RPROVIDES:${PN} += "cmake-KF5DAV \
kdav-devel"

RDEPENDS:${PN} += "libKF5DAV5"

inherit rpm
