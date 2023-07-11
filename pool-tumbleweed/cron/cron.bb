SUMMARY = "Auxiliary package"
DESCRIPTION = "Auxiliary package, needed for proper update from vixie-cron 4.1 to cronie 1.4.4"
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "4.2"

RPM_NAME = "cron-4.2-91.4.aarch64.rpm"
RPM_HASH = "025fd4d9f4bfe352639d4118b65de9e220707cef414cbf8bdd563426674d5d8455095657e57523b3b8b69f0ba7fc05e7ae46fd00636831817b0f82548ee6bbbd"

RPROVIDES:${PN} += "cron"

RDEPENDS:${PN} += "/usr/bin/sh \
cronie \
permissions"

inherit rpm
