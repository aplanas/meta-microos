SUMMARY = "Network monitoring application"
DESCRIPTION = "Meta package for Icinga 2 Core, DB IDO and Web."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "e9b21352172e21d9f97c893cfee5e16984b9a08e3da166164087686401d4b348515db0d74858d2cb394355f3568b9fe6821d131e1d3b9978f6015821d5ecbaf4"

RPROVIDES:${PN} += "config-icinga2 \
icinga2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
icinga2-bin \
icinga2-common \
logrotate \
permissions"

inherit rpm
