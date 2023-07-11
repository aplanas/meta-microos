SUMMARY = "Secure Reliable Transport (SRT)"
DESCRIPTION = "SRT is a video transport protocol and technology stack \
that optimizes streaming performance across unpredictable networks \
with secure streams and firewall traversal."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "srt-1.5.1-1.5.aarch64.rpm"
RPM_HASH = "e5d7ed5452725ca5432f5b87029971f735183784724b7023d853431ae6b9e816d2155e2b19180b0e8908cce719c2440783ed9b401b6811d78c2536e415c31adf"

RPROVIDES:${PN} += "srt"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrt.so.1.5 \
libstdc++.so.6"

inherit rpm
