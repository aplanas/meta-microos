SUMMARY = "Documentation for qt6-virtualkeyboard in QCH format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d6d3a57a7568c540a60dc4ab60f0292b349d337db092cb04c4ecafb610510f141a50a5d12787e23dc40445122cb19fb35d95932d0a6d64982b9c632602c8a27f"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
