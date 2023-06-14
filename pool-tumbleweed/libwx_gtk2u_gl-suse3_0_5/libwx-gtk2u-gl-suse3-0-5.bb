SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_gl-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "b78248addd191d846a2f59ece2745952e3d49ce38dc92b0d78684ef89e4b9322a892ed808dc94e41a0e37a0eb4bf636b546002d752e08208f4bf6283b8654e11"

RPROVIDES:${PN} += "libwx-gtk2u-gl-suse.so.3.0.5 \
libwx-gtk2u-gl-suse3-0-5"

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
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
