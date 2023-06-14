SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_gl-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "c6bc57c635ceb1d683f11136285b518efdfa456a5427bd484d1c5d88d6cd03c26083d47c5ed1ae8d14cce917bb596f6da1593514967af789be8dcda854c67dfd"

RPROVIDES:${PN} += "libwx-gtk2u-gl-suse-nostl.so.3.0.5 \
libwx-gtk2u-gl-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
