SUMMARY = "Plugin to use prelude with a classic schema"
DESCRIPTION = "This plugin allows prelude to store alerts into a classic \
schema in database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-plugins-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "79d3570837e3d89f41e3fd1bf992e7461340b4d60960c63ef726873e024e4b8102862f0aadf017136cdc7a42f8fe79e2e56f4878f4b01d94a75e0e09e9359954"

RPROVIDES:${PN} += "libpreludedb-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28 \
libpreludedb.so.7"

inherit rpm
