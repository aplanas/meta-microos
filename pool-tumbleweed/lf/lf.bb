SUMMARY = "Terminal file manager (with sixel support)"
DESCRIPTION = "lf (as in 'list files') is a terminal file manager written in Go with a \
heavy inspiration from ranger file manager"
LICENSE = "MIT"

PV = "30"

RPM_NAME = "lf-30-1.1.aarch64.rpm"
RPM_HASH = "89a8e631d0ab3d2ee70084d5f998235aa8bc10a3aebc24272e05f15565835b7dcb853eb6073dd101554f89435cfe96c639c3c729cc9ad328fda665da56452fa6"

RPROVIDES:${PN} += "lf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
