SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-sdk-doc-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "bef0fb37299fb64a2807fb841d405ee0921b4eaab2b923ce391a20f5c7e90c81c866bcf18d2eead4c1b38bcb796ba87c7bea23eb93bbf4fcb80e9791422c1b67"

RPROVIDES:${PN} += "libreoffice-sdk-doc \
libreoffice-ure-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
