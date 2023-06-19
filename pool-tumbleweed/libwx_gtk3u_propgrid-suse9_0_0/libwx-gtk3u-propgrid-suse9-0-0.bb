SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_propgrid-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "c774b78fbff926aaaea0461b7d0ddb977024e4a60369eee343078cf916d177bda68ac061ba04cda2c220cba5b7083ada287fe1ad11d3bdd1b01cf89f96982b00"

RPROVIDES:${PN} += "libwx-gtk3u-propgrid-suse.so.9.0.0 \
libwx-gtk3u-propgrid-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
