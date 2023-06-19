SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "e089d1ee72e056005219602d9312cd13a923336db95e54c88f6f127872af3c768ce54dc908fdea4fbe93a0b1a94b37c889a304e6d9220c7f26c52bc0f9093a74"

RPROVIDES:${PN} += "libwx-gtk2u-propgrid-suse.so.9.0.0 \
libwx-gtk2u-propgrid-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
