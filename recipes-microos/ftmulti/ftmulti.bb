SUMMARY = "Multiple masters font viewer"
DESCRIPTION = "Multiple masters font viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftmulti-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "a5573d42fd0ae86147db72bfcd911a1eb5289d5d382fdb70dde27daf5045df0a630ada31d96481f22006dcdabbcf66b5a8ee01d2f9c4c0739d1540b882338936"

RPROVIDES:${PN} += "ftmulti ftmulti(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
