SUMMARY = "Standalone server for ddnet"
DESCRIPTION = "Standalone server for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "16.9"

RPM_NAME = "ddnet-server-16.9-1.1.aarch64.rpm"
RPM_HASH = "8e7dff787b75f9fa67ff64b72de44f176f31b35ec92b3e51a64af9a2657047fafbc3c5dfe607e45fefe49c9d8ccbc5325efe47d3030947dec8c3b77b48052fa1"

RPROVIDES:${PN} += "ddnet-server \
ddnet-server(aarch-64)"

RDEPENDS:${PN} += "ddnet(aarch-64) \
ld-linux-aarch64.so.1()(64bit) \
libantibot.so()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libminiupnpc.so.17()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
