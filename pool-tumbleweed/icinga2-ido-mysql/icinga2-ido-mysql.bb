SUMMARY = "IDO MySQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO mysql database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-ido-mysql-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "744086d3e4745903067a53a730ee5245d30e31e5e50c3b493e57ede746818d0bde916c62fcf4789532c0dd61484ccea66f359e5aaa5fed65ce66fef9c1e4867b"

RPROVIDES:${PN} += "config-icinga2-ido-mysql \
icinga2-ido-mysql \
libmysql-shim.so.2.13.7"

RDEPENDS:${PN} += "/usr/bin/sh \
icinga2-bin \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
