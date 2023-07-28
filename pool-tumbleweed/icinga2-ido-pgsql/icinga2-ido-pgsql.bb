SUMMARY = "IDO PostgreSQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO PostgreSQL database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-ido-pgsql-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "d15f81f11b4121944c4e1fd7d07451ff4270b8459bd11cb44dd59ee7d4443c33a2ef2d50540417e279304dd0e7a9bd11eedeb6c9f51ab12f39ba7e15d91ca34f"

RPROVIDES:${PN} += "config-icinga2-ido-pgsql \
icinga2-ido-pgsql \
libpgsql-shim.so.2.13.8"

RDEPENDS:${PN} += "/usr/bin/sh \
icinga2-bin \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
