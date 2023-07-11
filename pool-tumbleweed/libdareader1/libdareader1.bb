SUMMARY = "Read image/video from socket file"
DESCRIPTION = "Read image/video from socket file"
LICENSE = "GPL-3.0+"

PV = "0.0.0+git20220726.2d7d79c"

RPM_NAME = "libdareader1-0.0.0+git20220726.2d7d79c-2.3.aarch64.rpm"
RPM_HASH = "4442ff5f8536f9e22f9360ddc07773932c408d11b0a27f9886c8340f6a09e43462e17eabaab34de72700028531a2d7a23c738b502d9cffd14bd7df066e50eeea"

RPROVIDES:${PN} += "libdareader.so.1 \
libdareader1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
