SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-munin-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "1755636adf251709ec4a21a78f860bdd72ff255cc50cf0fe1633a654df87be8d973a9a5f094937e7b072ac936af715b46318d9ced1b35c8c0f848b64c85e4c81"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
