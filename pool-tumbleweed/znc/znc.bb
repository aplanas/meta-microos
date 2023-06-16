SUMMARY = "Advanced IRC Bouncer"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-1.8.2-3.7.aarch64.rpm"
RPM_HASH = "19a5d1e39c5256276a8f58d0db2341136786e36bde95c4680435a7ce9abf42d3fef6fbe84930ce31e1407bf52e056e2e8d133fb8fac84113f57c784a72d2b3e1"

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
