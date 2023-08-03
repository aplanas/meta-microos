SUMMARY = "Standalone server for ddnet"
DESCRIPTION = "Standalone server for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "17.1.1"

RPM_NAME = "ddnet-server-17.1.1-1.1.aarch64.rpm"
RPM_HASH = "7665f4e298ae7b28b36aa30df302f1464d936d6e2492398383a154128a0e55108bd72f27813e58d7fe1c85faa3f95d6ce8afd437e06ab79da6fe7c1aed878ab1"

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
