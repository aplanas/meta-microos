SUMMARY = "C++ library for accessing sonos devices"
DESCRIPTION = "C++ library for accessing sonos devices \
The API supports basic features to browse music index and control playback \
in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "libnoson2-2.10.2-1.2.aarch64.rpm"
RPM_HASH = "7cb43e72c7539904a1ea669345337b4e607ff67597369832aa0596ff56461f34923b9f29e7f717b0819154cb7847ebcd03176fb2b86a35a94e566990f345c7cb"

RPROVIDES:${PN} += "libnoson.so.2 \
libnoson2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.10 \
libFLAC.so.12 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
