SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkgapi-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fa6e72e6964fe5115912e68e6d8357fb7e92be0f8c62e466552c0fe13514f83a6f94ea379cda7b4f17580d681c6254ed354201f556812f55e1686499b58218bf"

RPROVIDES:${PN} += "libkgapi"

RDEPENDS:${PN} += ""

inherit rpm
