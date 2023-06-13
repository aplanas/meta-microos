SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_net-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "c1af351395d583037982631a80016e958d3cad6b4754511fe17659563b6be83918bbfa40fec5dc8038cf42df9c1a085aa5c8318c5b2b280a6bec32706042520b"

RPROVIDES:${PN} += "libwx_baseu_net-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu_net-suse-nostl3_0_5 \
libwx_baseu_net-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
