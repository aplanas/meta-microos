SUMMARY = "SQLite backend for Minion job queue"
DESCRIPTION = "Minion::Backend::SQLite is a backend for Minion based on Mojo::SQLite. All \
necessary tables will be created automatically with a set of migrations \
named 'minion'. If no connection string or ':temp:' is provided, the \
database will be created in a temporary directory."
LICENSE = "Artistic-2.0"

PV = "5.0.7"

RPM_NAME = "perl-Minion-Backend-SQLite-5.0.7-1.4.noarch.rpm"
RPM_HASH = "6f2262e95df585eeebbb321c8cba48f51f11e18ab7e21324d080a2adb2da5aeab141049c4a7637a36a06f69e7b8700b6e769eba026093c6ca2681115d83e821d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Minion--Backend--SQLite \
perl-Minion-Backend-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Minion \
perl-Mojo--SQLite \
perl-Mojolicious"

inherit rpm
