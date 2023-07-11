SUMMARY = "JFree Base Services"
DESCRIPTION = "LibBase is a library developed to provide base services like logging, \
configuration and initialization to other libraries and applications. The \
library is the root library for all Pentaho-Reporting projects."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libbase-1.1.6-1.5.noarch.rpm"
RPM_HASH = "f6baef617fc57fbfdfc0b28d6d3bbc7fc6a90d1f98db4dd1324c83d2fca33621e3a53183261fd52b20ff6d6b6ee9b899bd8c954d64efe07bf93ac355e83690f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbase"

RDEPENDS:${PN} += "apache-commons-logging \
java \
jpackage-utils"

inherit rpm
