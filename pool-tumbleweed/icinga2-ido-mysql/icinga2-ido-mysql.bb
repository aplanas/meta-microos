SUMMARY = "IDO MySQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO mysql database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-ido-mysql-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "447227712a8e25431f799a2ccb7a36a3f374d0cff635a9e403a19768279170a3e9ddf4c8feead5cc57dc882b1a0c59964f1d6fea584720df9fe2d330db09d984"

RPROVIDES:${PN} += "config-icinga2-ido-mysql \
icinga2-ido-mysql \
libmysql-shim.so.2.13.8"

RDEPENDS:${PN} += "/usr/bin/sh \
icinga2-bin \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
