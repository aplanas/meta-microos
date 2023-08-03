SUMMARY = "Documentation for texlive-scrabble"
DESCRIPTION = "This package includes the documentation for texlive-scrabble"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn65507"

RPM_NAME = "texlive-scrabble-doc-2023.209.0.0.1.3svn65507-54.1.noarch.rpm"
RPM_HASH = "f0ea11ecd7bddefbae408fa439ec5515afdbf747045c87972b601d57247e529044b13e0fe5aeb97a3123e28dd98213e05caaba3e062054e657f798a57c3829e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scrabble-doc-fr \
texlive-scrabble-doc"

RDEPENDS:${PN} += ""

inherit rpm
