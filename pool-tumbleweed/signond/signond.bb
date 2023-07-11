SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-8.60-2.19.aarch64.rpm"
RPM_HASH = "4d6f5a060c6ceed040f5e1b775b45b06f29b2006b9faae49dbbf3dd5dd0406bf84f097aec00edfa14038189c8424f313f8dbe08a15bb9925440c773da50183f4"

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
