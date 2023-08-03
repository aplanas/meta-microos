SUMMARY = "Documentation for qt6-virtualkeyboard in QCH format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-virtualkeyboard-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "581e8c332736f5378fe9952c2fe90f916a9303eeb678017af872b9142d28a7f10a5ae2a8c3e9707324c946fc10b36db6d1f072f84d7a7c9f3657055276a0a365"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
