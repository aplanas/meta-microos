SUMMARY = "Standalone server for ddnet"
DESCRIPTION = "Standalone server for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "17.2"

RPM_NAME = "ddnet-server-17.2-1.1.aarch64.rpm"
RPM_HASH = "bad4306f4d22a9791cc3b98b764ac3333bf4a1ef6018a727260c6d439537bc1526ac499f1f22d9bfc6da03f3cce5c8b7e7c3c7df81c9cd9eeda3531fb3d7f036"

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
