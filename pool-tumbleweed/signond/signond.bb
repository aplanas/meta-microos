SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-8.61-1.1.aarch64.rpm"
RPM_HASH = "d556302fcb9f7f7b6ab96505f82b66b02759bf11827484dd1ec153e2bb48a36886e4f2f8a70ef45c18ed0949d7d913389a67d3970db0d838e7f7cf99a991860d"

RPROVIDES:${PN} += "config-signond \
signond"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libproxy.so.1 \
libsignon-extension.so.1 \
libsignon-plugins-common.so.1 \
libsignon-plugins.so.1 \
libstdc++.so.6"

inherit rpm
