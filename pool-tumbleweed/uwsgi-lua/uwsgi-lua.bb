SUMMARY = "Lua Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Lua applications via the wsapi interface."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-lua-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "1233715c7e414c9e2606fdd59d2911ef5cc24f48e877e1150d2a581d56a120653032787c669da9287aeedf1dcb3c4e95aea2f119a3887dc318d955bd4c376acf"

RPROVIDES:${PN} += "uwsgi-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
uwsgi"

inherit rpm
