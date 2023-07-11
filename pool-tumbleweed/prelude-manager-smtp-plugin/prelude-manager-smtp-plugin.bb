SUMMARY = "SMTP alert plugin for Prelude Manager"
DESCRIPTION = "This plugin adds alerting by email capabilities to prelude-manager"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-smtp-plugin-5.2.0-2.11.aarch64.rpm"
RPM_HASH = "39694090c3587821bd7ef9726c7959d8824d2dc26e91ccf3a9bc7d799b7971508cfaea715bf0eb282f16ac284ad7ebfc497669a961ccd24584ac1710982f1b7a"

RPROVIDES:${PN} += "prelude-manager-smtp-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28 \
libpreludedb.so.7 \
prelude-manager"

inherit rpm
