SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "edebff48c6b26f66894728620f42f0be4fbefbb22d5578d07e940c1f8c7a2930cfa83c23332bf981d4eb8a5bd1c433bf86d3e99a5b2e3cea755095c16a1cfa30"

RPROVIDES:${PN} += "libwx-gtk2u-propgrid-suse-nostl.so.3.0.5 \
libwx-gtk2u-propgrid-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-adv-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
