SUMMARY = "Software to find duplicate extents in files and remove them"
DESCRIPTION = "Duperemove finds duplicate extents in files and prints them to the \
console. It also has the option to deduplicate extents on those file \
systems which support the Linux extent-same ioctl."
LICENSE = "GPL-2.0-only"

PV = "0.11.3"

RPM_NAME = "duperemove-0.11.3-1.7.aarch64.rpm"
RPM_HASH = "2c681887d342b52dd386d7fe28dadca06a4f9a22308075a44cfc2002063d1dbbb8814bd9a95cb99e0bb9fd597ee0f41d9d74d84166552cfc3dae3190683edc23"

RPROVIDES:${PN} += "duperemove \
duperemove(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
