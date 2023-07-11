SUMMARY = "Helper utilities to control QMI devices"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol. \
 \
This package contains command line tools to manage such devices."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "libqmi-tools-1.32.4-1.2.aarch64.rpm"
RPM_HASH = "0b1b66bc623350ac628ba381c2c7b6a7e1c522b0a2d731ad79994b2d16df69d46d507b346db7283c543f599b50af2d63e8a01aefdb1429f77f759d64f9aaf78e"

RPROVIDES:${PN} += "libqmi-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmbim-glib.so.4 \
libqmi-glib.so.5 \
libqrtr-glib.so.0"

inherit rpm
