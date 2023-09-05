SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-librelogo-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "1cbdd4499af06f3c671013a793a69c5a17e3120b438d664c5b6777993be2b9ede79a8612be520aa3a8fca5185a571cb724c9b3b8d2243aae17105828a0769db8"

RPROVIDES:${PN} += "libreoffice-librelogo"

RDEPENDS:${PN} += "libreoffice-pyuno \
libreoffice-writer"

inherit rpm
