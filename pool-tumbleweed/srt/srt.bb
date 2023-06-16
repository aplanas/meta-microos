SUMMARY = "Secure Reliable Transport (SRT)"
DESCRIPTION = "SRT is a video transport protocol and technology stack \
that optimizes streaming performance across unpredictable networks \
with secure streams and firewall traversal."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "srt-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "b747b41b805f054ea4676e5ddb5f11bf108b7f6cce9ad9ceca7be9153a20c822f5befee90ce6d8f3a635a32161a5c081e8b436182d548772d8a22d4b0e07ea59"

RPROVIDES:${PN} += "srt"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrt.so.1.5 \
libstdc++.so.6"

inherit rpm
