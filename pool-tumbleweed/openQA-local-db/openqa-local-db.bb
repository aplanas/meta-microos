SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-local-db-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "31bbd2dadb2c6be882bd139f2b5ef51846cd94111d852024cad9aeccb732968306733ce5400eb9a8405a797749b25f64f9df05fe8344bd87f6d694263468ee29"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
