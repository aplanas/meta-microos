SUMMARY = "Qt 6 Positioning library"
DESCRIPTION = "The Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Positioning6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "95aeb11949d9d2d59ef71f3f6cf35b5e366bfd243a6fa6faa5bdb65c4603f1ec42af77e143177a05a765d9914081d95d33bc73760af1dbcd777069590f2f2cc0"

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
