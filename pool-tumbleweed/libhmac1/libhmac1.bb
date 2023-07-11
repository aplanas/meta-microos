SUMMARY = "Library to support various HMACs"
DESCRIPTION = "A library to support various Hash-based Message Authentication Codes (HMAC)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac1-20230407-1.2.aarch64.rpm"
RPM_HASH = "678d0911805fadaa9051a87c8c45ef0c5f28a154dbc068e3a545a16131eab752561ab40c68ca7fc007f2f5ca19bbc90dec45a923f85d720a01b96af1390fb331"

RPROVIDES:${PN} += "libhmac.so.1 \
libhmac1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
