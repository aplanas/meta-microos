SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-sdk-doc-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "de6da7c1c61c8c6c0ab03aeb643cb5f3d69f6831a7761f821e39c18b070708e31c84742cac7d3389d3020f8470db38eb2fa61b64c498533def9c97b889316a23"

RPROVIDES:${PN} += "libreoffice-sdk-doc \
libreoffice-ure-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
