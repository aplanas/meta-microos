SUMMARY = "Advanced Intrusion Detection Environment"
DESCRIPTION = "AIDE is an intrusion detection system that checks file integrity."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.5"

RPM_NAME = "aide-0.18.5-1.1.aarch64.rpm"
RPM_HASH = "fc08c9e5c4af0c0757a603008eb27838ed5f03bffadfb9646e41554b8f192e203ba79efdd0ba579fff5d8c68d0cc6f8d8143ef7919cf05fe2d48da992b0a8d46"

RPROVIDES:${PN} += "aide \
config-aide"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libm.so.6 \
libpcre2-8.so.0 \
libselinux.so.1 \
libz.so.1"

inherit rpm
