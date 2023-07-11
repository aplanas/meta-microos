SUMMARY = "Documentation for sqliteodbc"
DESCRIPTION = "ODBC driver for SQLite interfacing SQLite 3.x using the \
unixODBC or iODBC driver managers. This package contains generated \
documentation."
LICENSE = "BSD-2-Clause"

PV = "0.9998"

RPM_NAME = "sqliteodbc-doc-0.9998-1.16.aarch64.rpm"
RPM_HASH = "33833d3e5b7070a75c9b275a1b3a304d02a663142fd4f604dd3a1b24c6c56edf144763c8044413617b348590d72349eccd979cb675b45fae45c8c7645cc64392"

RPROVIDES:${PN} += "sqliteodbc-doc"

RDEPENDS:${PN} += ""

inherit rpm
