SUMMARY = "Documentation for qt6-speech in HTML format"
DESCRIPTION = "This package contains documentation for qt6-speech in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-speech-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "79b85f44edf5c64b085d1e2c1edca5e5293b1d5329164c686c78177ea9342015307b505bbb9dad7fc0187d2f98de0ac785e5b0e3ab1b00970e1a909641b0e689"

RPROVIDES:${PN} += "qt6-speech-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
