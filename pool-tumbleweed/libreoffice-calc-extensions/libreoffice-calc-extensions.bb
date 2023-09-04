SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-calc-extensions-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "3bb8093ed40b083039b263b8d284b6cd36cbf7767e3752772c6c87d7cb7b6ce273a84d257d5bde595556a3bc97b1bb9a027e86bab4dc45c88f0bb9a9ce9f6996"

RPROVIDES:${PN} += "libreoffice-calc-extensions"

RDEPENDS:${PN} += "jre \
libreoffice \
libreoffice-calc \
libreoffice-pyuno"

inherit rpm
