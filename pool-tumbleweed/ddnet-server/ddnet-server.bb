SUMMARY = "Standalone server for ddnet"
DESCRIPTION = "Standalone server for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "16.9"

RPM_NAME = "ddnet-server-16.9-1.3.aarch64.rpm"
RPM_HASH = "f0e3c5583d371f630265f6697cada751967936807bd37c1cbb7d5a4de0006e35b50f8085361a72378e36a5e095fdf96d8b88b97439117c403c151ac9e7f576f7"

RPROVIDES:${PN} += "ddnet-server"

RDEPENDS:${PN} += "ddnet \
ld-linux-aarch64.so.1 \
libantibot.so \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.17 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
