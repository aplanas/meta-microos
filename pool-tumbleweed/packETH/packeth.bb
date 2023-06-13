SUMMARY = "Packet generator tool for ethernet"
DESCRIPTION = "packETH is tool for generating packets to send over ethernet."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "packETH-2.1-1.9.aarch64.rpm"
RPM_HASH = "43d26369d4899682a3fd669df452e9e9846b9b0a03aff1f6f0e4f2fca26f29148646310940dcd230187a99c28373ecff6956c2bea606ddb857b24697fe7662ef"

RPROVIDES:${PN} += "packETH \
packETH(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
