SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-librelogo-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "e7645738c4b8ef3d733f143ee8e6268c116714ba165038c7c8b05a1d1aa736fa4832fbc18fee69748a0acef70a7bf3777280acfad8a7c81507b3035888267b5b"

RPROVIDES:${PN} += "libreoffice-librelogo"

RDEPENDS:${PN} += "libreoffice-pyuno \
libreoffice-writer"

inherit rpm
