SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-calc-extensions-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "6a048a7fd82a28ac3f6970e38c52a13c624f39bc00bcc41ccd08acf40cf0a9b400744ff1aa132efe4bbb66fddb2246de56e512afb16a6363ec7790c505539f37"

RPROVIDES:${PN} += "libreoffice-calc-extensions"

RDEPENDS:${PN} += "jre \
libreoffice \
libreoffice-calc \
libreoffice-pyuno"

inherit rpm
