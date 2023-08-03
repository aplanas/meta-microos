SUMMARY = "Documentation for qt6-webview in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webview in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webview-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ac475796c4837dba08431d0ee91c650d0dd70251e5a3ea32d0f8b398db53091ad91172b9cde94c22e5afa325e2c0bcb5558ffaf5cc60c2f030a2e3d785fbdbb4"

RPROVIDES:${PN} += "qt6-webview-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
