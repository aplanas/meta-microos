SUMMARY = "Qt 6 Positioning library"
DESCRIPTION = "The Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Positioning6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b79824651af18fc340d72dc0894c41c2aa6d0417e423601518f3eff188171f63d3479dff1a40ec09325c2bc016966778503b460edf99aae53025afc9668e77a8"

RPROVIDES:${PN} += "libQt6Positioning.so.6 \
libQt6Positioning6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
