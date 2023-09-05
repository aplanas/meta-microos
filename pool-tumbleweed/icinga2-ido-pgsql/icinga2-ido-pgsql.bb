SUMMARY = "IDO PostgreSQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO PostgreSQL database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-ido-pgsql-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "d14f2bd08b312c449140bac197872c6b1cb1e7b6ba089afd644568729666df05a503a44030f9c797b66d030c7d25689a10e22dbbb5c7f091a945111d14560d1a"

RPROVIDES:${PN} += "config-icinga2-ido-pgsql \
icinga2-ido-pgsql \
libpgsql-shim.so.2.13.8"

RDEPENDS:${PN} += "/usr/bin/sh \
icinga2-bin \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
