SUMMARY = "Tools for libxfce4util"
DESCRIPTION = "This package contains tools for libxfce4util."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util-tools-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "86b7b7a481772c0664d587250afe8c670bb6d73c8730995c5450751fdb9845ea21c8f9ae447b8ef352b502a8a0d035181eb960523e432ebc9dba1288f3e1b096"

RPROVIDES:${PN} += "libxfce4util-/usr/sbin/xfce4-kiosk-query \
libxfce4util-tools"

RDEPENDS:${PN} += "libc.so.6 \
libxfce4util.so.7"

inherit rpm
