SUMMARY = "Documentation for texlive-glossaries-extra"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-extra"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.50svn64973"

RPM_NAME = "texlive-glossaries-extra-doc-2023.209.1.50svn64973-54.1.noarch.rpm"
RPM_HASH = "6902fca240a3548546fb61357450a1a72cf39d50583c78ea946a3c5f69df8319cf9c17b546bc80b1d0b6e3080ca03f34f0769503418ed2451f7b4b3e7d2e17f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
