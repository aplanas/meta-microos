SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "7660792b262d34778754f8237e4642d8cda782702f2aab9801ef6286ae36003706aee84feff32aca34a8a0b9c8f6605e0f786da15adc81203c6c0f1c697d536d"

RPROVIDES:${PN} += "libwx-gtk2u-media-suse-nostl.so.3.0.5 \
libwx-gtk2u-media-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
