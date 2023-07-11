SUMMARY = "PostgreSQL DBI module for Qore"
DESCRIPTION = "PostgreSQL module for the Qore Programming Language. \
 \
This package provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "3.2.0"

RPM_NAME = "qore-pgsql-module-doc-3.2.0-2.4.aarch64.rpm"
RPM_HASH = "f44d7d76ced5e021cab4088f53a236504a1b9e48cb2741650e60f41b21e16e55220eb8d7c19460515e26ba661db1f6f1493796a6a74f7c18015bdaa9877a6ead"

RPROVIDES:${PN} += "qore-pgsql-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
