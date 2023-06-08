SUMMARY = "Utility for examining and tuning Ethernet-based network interfaces"
DESCRIPTION = "Ethtool is a small utility for examining and tuning ethernet-based \
network interfaces.  See the man page for more details."
LICENSE = "GPL-2.0-only"

PV = "6.2"

RPM_NAME = "ethtool-6.2-2.3.aarch64.rpm"
RPM_HASH = "284969a63921b57b20fd8a9123a8f2ea50ec977c06c6c686ba5cd958b05d13ab483ad9056a5d8afe6b3d100e4a7d066297a515149190c14eeb297083b1156d12"

RPROVIDES:${PN} += "ethtool ethtool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
