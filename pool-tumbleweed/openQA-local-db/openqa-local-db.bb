SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-local-db-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "f25c43e06957bab2106a423af58917e4b14688c50e9f1ea6e70ba05206b3bbff49d9f2f56a440dd42f3020808abb8b9954c25a0d93d6c1ce6195dd6b327bfcf8"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
