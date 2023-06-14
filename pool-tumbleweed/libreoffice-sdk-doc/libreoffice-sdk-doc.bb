SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-sdk-doc-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "d17d4060730c5749f1ce22ae0d7582b54720b8439ac6ecd011bb1adc83d56b01d877301e28f276a1a5f25f2b675605aeb93c754fd04939c77d01586e44166187"

RPROVIDES:${PN} += "libreoffice-sdk-doc \
libreoffice-ure-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
