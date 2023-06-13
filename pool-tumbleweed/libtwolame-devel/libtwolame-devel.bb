SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "libtwolame-devel-0.4.0-1.14.aarch64.rpm"
RPM_HASH = "7b99b6b6042aad82c3cdadd751b23dc819e16ccab33edc7bb05872a450c070b3dde675ae7d7bf55496c53966d9c0c425ebaf2ea00de4d6609d8ff6b6536bafc1"

RPROVIDES:${PN} += "libtwolame-devel \
libtwolame-devel(aarch-64) \
pkgconfig(twolame) \
twolame-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtwolame0"

inherit rpm
