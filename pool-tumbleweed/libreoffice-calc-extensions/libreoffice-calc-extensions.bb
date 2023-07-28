SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-calc-extensions-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "9819e6c84c98bdf74bc748df2f0117fd9c3159f6a390907fb4f1bd70a52016dd2a3a33f5c159afddbbcf14bfb7de96509d79847491e66c2894ced68cf1545bd3"

RPROVIDES:${PN} += "libreoffice-calc-extensions"

RDEPENDS:${PN} += "jre-64 \
libreoffice \
libreoffice-calc \
libreoffice-pyuno"

inherit rpm
