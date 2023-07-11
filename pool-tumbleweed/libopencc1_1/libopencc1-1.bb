SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides shared libraries of OpenCC."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "libopencc1_1-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "47fc509afd13e7665347d14d6692ca6e7260b1f24fc3491dae8082d9a06076f89db7d6f9387e0db51e5c5a8cda1073a80cfd9b951bc32827e2ec409d096d4e61"

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
