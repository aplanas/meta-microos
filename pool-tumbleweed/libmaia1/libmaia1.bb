SUMMARY = "XML-RPC library for Qt"
DESCRIPTION = "libmaia is a XML-RPC library for Qt."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia1-0.9.0-1.25.aarch64.rpm"
RPM_HASH = "75d9d942215ca8fcb5d3427fa596b0df2d5a45286eca85b252fc06e97420e16a8256d422c677f0f82ade511e68a66437476e6682adf58dc9e9bf276ab073b0a8"

RPROVIDES:${PN} += "libmaia.so.1 \
libmaia1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
