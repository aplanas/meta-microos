SUMMARY = "Network monitoring application"
DESCRIPTION = "Meta package for Icinga 2 Core, DB IDO and Web."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "2089f32f9c74b133a4085b8a246d1a340c603b107373db504b63c7d5552129ca35c77f6beea41f53c69b15528ea3c04b904d0da9e12b51ab1d472c0c3103ea8b"

RPROVIDES:${PN} += "config-icinga2 \
icinga2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
icinga2-bin \
icinga2-common \
logrotate \
permissions"

inherit rpm
