SUMMARY = "Library to support various HMACs"
DESCRIPTION = "A library to support various Hash-based Message Authentication Codes (HMAC)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac1-20230407-1.1.aarch64.rpm"
RPM_HASH = "753f1b380e01dd8dd1af5c942b30fd303cd738cca6a2ceefc1ae81c849bc2e4896c7d7180dd14f01d27fa1d862845ed7cda7618140feab78897267fb630a6cf0"

RPROVIDES:${PN} += "libhmac.so.1 \
libhmac1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
