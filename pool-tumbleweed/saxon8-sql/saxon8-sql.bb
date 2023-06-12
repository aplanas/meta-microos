SUMMARY = "SQL support for saxon8"
DESCRIPTION = "Supports XSLT extensions for accessing and updating a relational \
database from within a stylesheet."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-sql-B.8.8-133.6.noarch.rpm"
RPM_HASH = "deb1efef59867d7578d064ee3dad697d56fe727e01088286f55178ac9df98bdfeefbed307e6cf4ada6f4accbe05e376787b0489ed2ee584d58ab121634981080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-sql"
RDEPENDS:${PN} += "saxon8"

inherit rpm
