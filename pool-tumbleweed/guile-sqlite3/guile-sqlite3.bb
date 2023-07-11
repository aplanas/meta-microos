SUMMARY = "SQLite3 database access from Guile"
DESCRIPTION = "This package provides Guile bindings to the SQLite3 database system."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "guile-sqlite3-0.1.3-1.9.aarch64.rpm"
RPM_HASH = "9c211b885cf2c591c6627051c583ff78830fc7ae8d92a5f17ceab9780dd3181dbc05e18722ca3bbeb06f04fa65a10932ab115c8e74f9071912d11675e4db7ea6"

RPROVIDES:${PN} += "guile-sqlite3"

RDEPENDS:${PN} += "guile \
sqlite3-devel"

inherit rpm
