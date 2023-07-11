SUMMARY = "SQLite backend for Minion job queue"
DESCRIPTION = "Minion::Backend::SQLite is a backend for Minion based on Mojo::SQLite. All \
necessary tables will be created automatically with a set of migrations \
named 'minion'. If no connection string or ':temp:' is provided, the \
database will be created in a temporary directory."
LICENSE = "Artistic-2.0"

PV = "5.0.7"

RPM_NAME = "perl-Minion-Backend-SQLite-5.0.7-1.3.noarch.rpm"
RPM_HASH = "5511bb08d15b5734f01985e22cedc7b81ad1d29d5168b761f3bf6382251310a3f213e35afe7ed42caf2e66aa33bd074486522218dd306db7b220d64a74c4a106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Minion--Backend--SQLite \
perl-Minion-Backend-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Minion \
perl-Mojo--SQLite \
perl-Mojolicious"

inherit rpm
