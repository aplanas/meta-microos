SUMMARY = "ID3 and APE metadata support for Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudtag3-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "bbb0970356db030c2a3c1d3f3696d9881bc366f5362924876d517779da2996d0ccd7ca611838106c65a3bb07ee01881309eca4327d99a95c00bd9e48114ca0fa"

RPROVIDES:${PN} += "libaudtag.so.3 \
libaudtag3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudcore.so.5 \
libaudcore5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
