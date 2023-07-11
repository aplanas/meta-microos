SUMMARY = "Lua Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Lua applications via the wsapi interface."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-lua-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "68bc9909912a1335521bad422eb102bd6ba6252e31dcd8034ffb111ea569a6d02bfb39ffe57ca902afc73874b70ba556e369af8af572ea9490968dbcfbfcb649"

RPROVIDES:${PN} += "uwsgi-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
uwsgi"

inherit rpm
