SUMMARY = "Deepin Network Utils libraries"
DESCRIPTION = "The  package contains the Libraries for deepin-network-utils."
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "libdde-network-utils1-5.4.13-1.8.aarch64.rpm"
RPM_HASH = "3cab52fcadb8b479792e779cadc7306d2042e26ca272b13be89257bd56d100376801fbc014eaf91b3462b73fc6291ea8bcc855383746e5dd5736ddb1e9cb4d0c"

RPROVIDES:${PN} += "libdde-network-utils.so.1 \
libdde-network-utils1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libstdc++.so.6"

inherit rpm
