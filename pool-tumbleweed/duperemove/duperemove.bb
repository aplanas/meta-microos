SUMMARY = "Software to find duplicate extents in files and remove them"
DESCRIPTION = "Duperemove finds duplicate extents in files and prints them to the \
console. It also has the option to deduplicate extents on those file \
systems which support the Linux extent-same ioctl."
LICENSE = "GPL-2.0-only"

PV = "0.11.3"

RPM_NAME = "duperemove-0.11.3-1.8.aarch64.rpm"
RPM_HASH = "28b4b1c1d77c502d494bdb95d89ff385693e172f246132c10cc3436c190623fb394c346804f3cee5be408546c4842acc8ccca23fc64e8b8456561ce98ae06652"

RPROVIDES:${PN} += "duperemove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
