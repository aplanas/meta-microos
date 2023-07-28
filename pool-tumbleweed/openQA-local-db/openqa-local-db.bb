SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-local-db-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "f84dc18e5fb0a8b21e871955685d4b15700b0c3df2b58933dd206008eb31590c09e71cb3c1483b8e5b7d0a37e9a8410b13974ab93c7cff9db515ea408aaeb985"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
