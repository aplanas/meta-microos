SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "d06999c6fea101f38700fa5684155251a331bdb3cb5f3963edd6d59b09c8e4293c67be5be1be51ddbe810430026479f1c527a19fabeb988d14622bf673c8c8b5"

RPROVIDES:${PN} += "libwx-gtk2u-aui-suse.so.3.0.5 \
libwx-gtk2u-aui-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
