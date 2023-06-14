SUMMARY = "SMTP alert plugin for Prelude Manager"
DESCRIPTION = "This plugin adds alerting by email capabilities to prelude-manager"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-smtp-plugin-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "da4b8a387551266459a34d9d177f416db70967468e1b6c0fa40d0ea59342714de64385e58378099dada3abd7461b8ac318616ca6e3ce2fca319ce9307494da58"

RPROVIDES:${PN} += "prelude-manager-smtp-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28 \
libpreludedb.so.7 \
prelude-manager"

inherit rpm
