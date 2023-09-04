SUMMARY = "Secure Reliable Transport (SRT)"
DESCRIPTION = "SRT is a video transport protocol and technology stack \
that optimizes streaming performance across unpredictable networks \
with secure streams and firewall traversal."
LICENSE = "MPL-2.0"

PV = "1.5.2"

RPM_NAME = "srt-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "5ab3ed70f97e697c1bd5b5dc04d253231458eb881988998a5b1433beb04b831385c4fc6234401267b98f2f6a390e0b261a86d3b7baf6ed5631041edc3431053e"

RPROVIDES:${PN} += "srt"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrt.so.1.5 \
libstdc++.so.6"

inherit rpm
