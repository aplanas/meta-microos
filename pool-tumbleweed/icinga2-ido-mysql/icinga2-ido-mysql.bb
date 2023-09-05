SUMMARY = "IDO MySQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO mysql database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-ido-mysql-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "43d6099498ff577be1a4609de0419af24f93ccd16325bc4d9f8800cc66b3af8126fde12ccdcd097396d8252e132112f10fcb8f56d68f177de91ffd4247909d5a"

RPROVIDES:${PN} += "config-icinga2-ido-mysql \
icinga2-ido-mysql \
libmysql-shim.so.2.13.8"

RDEPENDS:${PN} += "/usr/bin/sh \
icinga2-bin \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
