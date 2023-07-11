SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_stc-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "46af7ad11dc445efdd4244f23ab58bc1ef1a14045623a5d729406ded36fcc554114b3f2daa3ddbeb23ff99fc7aeb1cca9cee95e1e20bd18774a7f680cddf24b7"

RPROVIDES:${PN} += "libwx-gtk2u-stc-suse.so.3.0.5 \
libwx-gtk2u-stc-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
