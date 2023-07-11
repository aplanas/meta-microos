SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-sdk-doc-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "c30104733a46c68b30abc06c024c581dd0d6a448776ef7c49aead8aed8b532c20497e6086c98d645d802fa0b028f2f3ede397055c83aeb99ca7c572ac382b2b3"

RPROVIDES:${PN} += "libreoffice-sdk-doc \
libreoffice-ure-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
