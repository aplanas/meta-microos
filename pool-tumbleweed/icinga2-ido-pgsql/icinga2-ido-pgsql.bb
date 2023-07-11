SUMMARY = "IDO PostgreSQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO PostgreSQL database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-ido-pgsql-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "3bc1ec6a5e00bf1363a37985b33603de347bb4dc189adb7ad0b26d262b377d290a1079daee642147729abda1215849f6c9cf468296d0be022654e9b134012636"

RPROVIDES:${PN} += "config-icinga2-ido-pgsql \
icinga2-ido-pgsql \
libpgsql-shim.so.2.13.7"

RDEPENDS:${PN} += "/usr/bin/sh \
icinga2-bin \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
