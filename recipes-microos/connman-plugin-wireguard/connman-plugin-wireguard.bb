SUMMARY = "WireGuard plugin for connman"
DESCRIPTION = "Provides WireGuard network support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-wireguard-1.41-4.7.aarch64.rpm"
RPM_HASH = "e4bf44eb012aa55820f218ee12505820b2088c1ce285768ce65a23801f4c17e7e34375c4b818a8afd8204078b02b897cec82daa0577e83f85f416dc19a79d59a"

RPROVIDES:${PN} += "connman-plugin-wireguard \
connman-plugin-wireguard(aarch-64)"
RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
