SUMMARY = "Network monitoring application"
DESCRIPTION = "Meta package for Icinga 2 Core, DB IDO and Web."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "5c2ac711e687862c859b52b900bb2686d8bc2b10384dafb30a054db856db619f3e959e7350f747de04ddd32dcba619d787c140b9cb459208cd51d20073327106"

RPROVIDES:${PN} += "config(icinga2) \
icinga2 \
icinga2(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
icinga2-bin \
icinga2-common \
logrotate \
permissions"

inherit rpm
