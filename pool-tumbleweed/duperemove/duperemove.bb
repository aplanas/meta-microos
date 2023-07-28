SUMMARY = "Software to find duplicate extents in files and remove them"
DESCRIPTION = "Duperemove finds duplicate extents in files and prints them to the \
console. It also has the option to deduplicate extents on those file \
systems which support the Linux extent-same ioctl."
LICENSE = "GPL-2.0-only"

PV = "0.12"

RPM_NAME = "duperemove-0.12-1.1.aarch64.rpm"
RPM_HASH = "d9fa90b8a66938f4c4e65c5c70a09e971f827470990e82b65fb55a167739e7924c2c08fa13d455afe14ed844b9291a649dc85fc722d2249dcb2a9f604e98b345"

RPROVIDES:${PN} += "duperemove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
