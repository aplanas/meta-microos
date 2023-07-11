SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "728fc59f4a034572d921b313703791743be426aa6940cb57154c402e3c88b81fb34da814b83997f9bdfe1cfd898c005b45bffc47afb3b2c0bb1491a98ae98e57"

RPROVIDES:${PN} += "libwx-gtk2u-propgrid-suse.so.3.0.5 \
libwx-gtk2u-propgrid-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
