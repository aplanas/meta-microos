SUMMARY = "Documentation for sqlite3"
DESCRIPTION = " \
Contains HTML documentation for SQLite: SQL Syntax, C/C++ API and \
other documentation found on sqlite.org. The files can be found in \
/usr/share/doc/packages/sqlite3-doc."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "sqlite3-doc-3.42.0-1.2.noarch.rpm"
RPM_HASH = "7abd6ddee4ef81752fbc29288ed7a7146f1c41d4805023e0aed352dbbfe45a94311b46a879ae6918029f624e2cc1964608265df5e39e65d4fa35047387a67e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite3-doc"

RDEPENDS:${PN} += ""

inherit rpm
