SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-local-db-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "731d6092611918a6765f7f3a7bcc54e5f80d78941e7a3b9ab90698d4ba4bc8c3c0e4175ba7b6c6489a96a914f7230f429a769f2d424ac36c032919b3730ae3bf"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
