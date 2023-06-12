SUMMARY = "A Tool for Resizing BDF Format Fonts"
DESCRIPTION = "bdfresize is a command for magnifying or shrinking fonts described in the \
standard BDF format."
LICENSE = "GPL-2.0+"

PV = "1.5"

RPM_NAME = "bdfresize-1.5-571.22.aarch64.rpm"
RPM_HASH = "b664675cfa4b941c2ceee165647acea0963b398937f3c51db8879f8c0475c9c77b80b690527e21864faaced33514eab246ae133de8380d5d79799f21b1f61e67"

RPROVIDES:${PN} += "bdfresize \
bdfresize(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
