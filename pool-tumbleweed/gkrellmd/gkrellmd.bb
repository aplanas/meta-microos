SUMMARY = "Multiple Stacked Monitors daemon"
DESCRIPTION = "The GNU Grell Monitors daemon service, independent from any GUI library."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellmd-2.3.11-2.11.aarch64.rpm"
RPM_HASH = "84eb21e2bce103f8cc2a20a9b6c6d853a5d4c49c0cf8c3bd4f83be98f385ff4677dfff80322a361606cc4fbd23db65bc1d74b6f38e6d9d89e04de65db77b561d"

RPROVIDES:${PN} += "config-gkrellmd \
gkrellmd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libsensors.so.4"

inherit rpm
