SUMMARY = "Library to control QMI devices"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "libqmi-glib5-1.32.4-1.2.aarch64.rpm"
RPM_HASH = "fe7d712bb5034e16f7450e2617b526419695eea6cc9bf73f1f795154ff71612455061b8ab6adca0f07ce6f3e1fad96664d053c86b695f4b17c091c76ec029533"

RPROVIDES:${PN} += "libqmi-glib.so.5 \
libqmi-glib5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmbim-glib.so.4 \
libqrtr-glib.so.0"

inherit rpm
