SUMMARY = "Devel files for luajit"
DESCRIPTION = "Devel files for luajit package"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "luajit-devel-2.1.0~beta3+git.1669107176.46aa45d-2.3.aarch64.rpm"
RPM_HASH = "aaf098faa9758bf4f013a32ceec5b3ff344fc80e4be0c451f5e79fc3e05cc5ce13191990e98ca2154a3fe32fe69943c174e754066375e494db74edec79c550c4"

RPROVIDES:${PN} += "libluajit-devel \
luajit-devel \
luajit-devel(aarch-64) \
pkgconfig(luajit)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
luajit \
luajit-5_1-2"

inherit rpm
