SUMMARY = "Extra plugins for TagLib"
DESCRIPTION = "Unofficial TagLib file type plugins maintained by the Amarok project"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "taglib-extras-devel-1.0.1-24.16.aarch64.rpm"
RPM_HASH = "2ddf3099d98fb108984dfc0216025c736cfa34b8b680b4e68d2d297150f701b8768e7cf636c6f71b278af2561d94f654a9f21d90e0ef04b6947c2d08d06e6a3d"

RPROVIDES:${PN} += "pkgconfig-taglib-extras \
taglib-extras-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libstdc++-devel \
libtag-extras1"

inherit rpm
