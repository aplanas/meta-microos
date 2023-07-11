SUMMARY = "Encoder and decoder of the ITU G.729 Annex A/B speech codec"
DESCRIPTION = "Bcg729 is an implementation of both encoder and decoder of the ITU \
G.729 Annex A/B speech codec. It supports concurrent channels \
encoding/decoding for multi call application such as conferencing."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "libbcg729-0-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "1764d3dfd3813c37caa128108a87a9f9de2f6f875a518bf1f03879dc069bc8cfa4b17b5ffaa3b61f0c58f7ec39f47e4f7c46b9c1143d08e6c2a240085e05c5a9"

RPROVIDES:${PN} += "libbcg729-0 \
libbcg729.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
