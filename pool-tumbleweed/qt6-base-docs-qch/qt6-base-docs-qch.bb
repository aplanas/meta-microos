SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-base-docs-qch-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "8d1d8c2820019e1ce975ca9081cbf24d5742534cd2b4ec900ffa33fd060d887c0da7bdef05574bd3def0253dfae5f297706034fc39d4c4cf9cc0db1a05edf2e5"

RPROVIDES:${PN} += "qt6-base-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
