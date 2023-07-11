SUMMARY = "Tools for libaccounts-glib"
DESCRIPTION = "This package contains the tools for the accounts-glib library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib-tools-1.26-1.4.aarch64.rpm"
RPM_HASH = "3943af84fc585d20e16c4b13d16069e11d233d92402311d680335db28909a85e9ca71c654201cca968dcd47aef37c28d809a1d135c1dbdfa2b7b534c2c3ebb3b"

RPROVIDES:${PN} += "libaccounts-glib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaccounts-glib.so.0 \
libaccounts-glib0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
