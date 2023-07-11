SUMMARY = "Network monitoring application"
DESCRIPTION = "Meta package for Icinga 2 Core, DB IDO and Web."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "e0dd7d2007746fb646e97a065d27b427d86adbc1447cc42fb50f428dab5f47ce525625e52e954ec7cb2872fc1019af868292650811472d25b08f4c9b8aba6123"

RPROVIDES:${PN} += "config-icinga2 \
icinga2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
icinga2-bin \
icinga2-common \
logrotate \
permissions"

inherit rpm
