SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "d8f866afb43fb998a07532320e993f7e01500276f478b8ff76aca8e6e2cfb92518ab496e0d8e3c1185cdd64ba7bc0dfecbcaba687a9b225243b134569d7c2756"

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
