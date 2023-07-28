SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-sdk-doc-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "fb57203115b546edc1763c91dae375bc56ed181921c925fd2a9b36b103734b31081a72f6e496b5de1bf7ae8215c233f6e917f94967171bce39dce3dfebdbd8ca"

RPROVIDES:${PN} += "libreoffice-sdk-doc \
libreoffice-ure-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
