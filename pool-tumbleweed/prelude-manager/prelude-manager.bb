SUMMARY = "Bus communication for all Prelude modules"
DESCRIPTION = "Prelude Manager is a high availability server that \
accepts secured connections from distributed sensors \
and saves received events to a media specified by the user \
(database, log file, mail etc.). The server schedules and \
establishes the priorities of treatment according to the \
critical character and the source of the alerts."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-5.2.0-2.11.aarch64.rpm"
RPM_HASH = "7a9858aa44473e49f952c1f42b0ad249641ec0c8f067c31f49168535524b2864690a1c69fc091af71196a22d274b954606ea8def3dd7ee50f62d37a67747580e"

RPROVIDES:${PN} += "config-prelude-manager \
prelude-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libmaxminddb.so.0 \
libprelude.so.28 \
libwrap.so.0"

inherit rpm
