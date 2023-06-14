SUMMARY = "Auxiliary package"
DESCRIPTION = "Auxiliary package, needed for proper update from vixie-cron 4.1 to cronie 1.4.4"
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "4.2"

RPM_NAME = "cron-4.2-91.3.aarch64.rpm"
RPM_HASH = "0c67b654d69a244931f1904eaa0d5411790a94b9b8b625a3b0a12c7422e3c3a82f5612d682d68f6d33dc980dfab40ceb3f907e457ec5c8abd8b153fad200e0b1"

RPROVIDES:${PN} += "cron"

RDEPENDS:${PN} += "/bin/sh \
cronie \
permissions"

inherit rpm
