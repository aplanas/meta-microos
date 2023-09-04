SUMMARY = "Devel files for luajit"
DESCRIPTION = "Devel files for luajit package"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "luajit-devel-2.1.0~beta3+git.1669107176.46aa45d-3.1.aarch64.rpm"
RPM_HASH = "d6656dc6e0ab4ff82c0f8c850478dca21926132e4ec3624905aa4b07389ce4537de258063af5ed0768c8432acb8025ea943a822c87c4e5ae4dcf73111f8a6faf"

RPROVIDES:${PN} += "libluajit-devel \
luajit-devel \
pkgconfig-luajit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
luajit \
luajit-5-1-2"

inherit rpm
