SUMMARY = "Advanced IRC Bouncer"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-1.8.2-3.8.aarch64.rpm"
RPM_HASH = "c3e08440e947bbfeea2a6455e99aa4760ebe6d120bca4f89c1ecaf060c7b74eeaced115a836897f33bb7f6417aefeb870a6f612218ae0e7eb048473cb46775f0"

RPROVIDES:${PN} += "znc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-locale.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libicuuc.so.73 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
shadow"

inherit rpm
