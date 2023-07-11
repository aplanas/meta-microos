SUMMARY = "Tools for libxfce4util"
DESCRIPTION = "This package contains tools for libxfce4util."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util-tools-4.18.1-1.4.aarch64.rpm"
RPM_HASH = "5e25eee183193799a51921b052655ef6247007ef81fe2504f4ac78c0ea2200220d9c900acfe3d15105ace19e35336af3a1306cc35c545df85505583950a4659c"

RPROVIDES:${PN} += "libxfce4util-/usr/sbin/xfce4-kiosk-query \
libxfce4util-tools"

RDEPENDS:${PN} += "libc.so.6 \
libxfce4util.so.7"

inherit rpm
