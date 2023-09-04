SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-local-db-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "12cab63a325a6cd23faa7650035ebba551cb89289f025ed38a3bf9a0f3fb931fe3537fbd14d31876204f0d7e29ba8d37fd5cd586a82b474b9d26ccb2ca1d5ad2"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
