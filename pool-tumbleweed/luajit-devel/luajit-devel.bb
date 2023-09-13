SUMMARY = "Devel files for luajit"
DESCRIPTION = "Devel files for luajit package"
LICENSE = "MIT"

PV = "5.1.2.1.0+git.1693350652.41fb94d"

RPM_NAME = "luajit-devel-5.1.2.1.0+git.1693350652.41fb94d-1.1.aarch64.rpm"
RPM_HASH = "e8788904046191006873d7ba21bf6387a88cb3ccb436b2cd48ceea25cf1653532698cdd18de8182d7a1d3565b8bf8b6d719469a5d7277a2733c8ec6d65664632"

RPROVIDES:${PN} += "libluajit-devel \
luajit-devel \
moonjit-devel \
pkgconfig-luajit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
luajit \
luajit-5-1-2"

inherit rpm
