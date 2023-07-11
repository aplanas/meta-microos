SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-calc-extensions-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "8303c866f59983232c8c553874e49147088aa910a79b5dc8d66e767580d2e1c6c8fe5bbad8d1501108fd43599ced516f4ea1f053c0fec558c12835c75cf9146f"

RPROVIDES:${PN} += "libreoffice-calc-extensions"

RDEPENDS:${PN} += "jre-64 \
libreoffice \
libreoffice-calc \
libreoffice-pyuno"

inherit rpm
