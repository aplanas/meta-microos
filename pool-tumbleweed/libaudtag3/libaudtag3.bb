SUMMARY = "ID3 and APE metadata support for Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudtag3-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "7c441a8c55288271aff395d46bccff2974016062d10d41777aa43620d0829be140af7505added027e207a0681d5575bde3c02963026a82ced572f46a728bb6a6"

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
