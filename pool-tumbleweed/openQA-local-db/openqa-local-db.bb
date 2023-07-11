SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-local-db-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "98209b1b918af348c2de4b615f8fcd05aa0d82e270a97c7be57c8799f098970c4ed1faca054669f44a660de84e422428d3852a4ffadd8d919d41a225da608aaa"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
