SUMMARY = "Plugins for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds MariaDB library plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "libmariadb_plugins-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "cb4c3f0264f4584d043c938c16d3ab3483a52777c7a0c016ac26587a345ddd753a93218ae13448574d5c1653a66183a32515291c9f8e76e24005f1a5f597dc52"

RPROVIDES:${PN} += "libmariadb-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgssapi-krb5.so.2"

inherit rpm
