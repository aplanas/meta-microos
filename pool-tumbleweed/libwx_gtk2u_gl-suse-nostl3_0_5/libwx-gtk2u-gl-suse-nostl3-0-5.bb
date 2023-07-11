SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_gl-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "8b531c342bd0b9a5f48dae9f0e665db380da669d39e7ab55e99721677e759cb4357f291518c6043a1cfe23f5814311636658e0af994f3de21e131bec01e8c836"

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
