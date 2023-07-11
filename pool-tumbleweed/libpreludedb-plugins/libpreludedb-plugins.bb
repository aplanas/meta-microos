SUMMARY = "Plugin to use prelude with a classic schema"
DESCRIPTION = "This plugin allows prelude to store alerts into a classic \
schema in database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-plugins-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "fabc5d5247d20fb4d212c9493238b1a5da23027b91c54f478b02b03b32f0d86cde74842c9a1c79d7acd564c0e4c22e9a7d9c925b7bf0e75cf1d2cdc6a48bd39a"

RPROVIDES:${PN} += "libpreludedb-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28 \
libpreludedb.so.7"

inherit rpm
