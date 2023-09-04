SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-librelogo-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "98837bb84ee3f954b38b674279bf1769be8928ea6e68a499295da828c116ef1b8e5fc0467c6aeb0730a2f62444d94c37b9f9735d115841182f5dd48283e29cab"

RPROVIDES:${PN} += "libreoffice-librelogo"

RDEPENDS:${PN} += "libreoffice-pyuno \
libreoffice-writer"

inherit rpm
