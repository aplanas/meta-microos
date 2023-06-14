SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides shared libraries of OpenCC."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "libopencc1_1-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "9c54e6a9e2770648fc3bd0211b6eaf974d7eec32aa17de8a553a380fd852abaa8b013d51c733f172643b743cbc6cf189f74a7b86f8f639161c61c52bdb8af2db"

RPROVIDES:${PN} += "libopencc.so.1.1 \
libopencc1-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
opencc-data"

inherit rpm
