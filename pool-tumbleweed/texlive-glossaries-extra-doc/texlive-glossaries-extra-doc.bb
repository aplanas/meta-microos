SUMMARY = "Documentation for texlive-glossaries-extra"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-extra"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.50svn64973"

RPM_NAME = "texlive-glossaries-extra-doc-2023.209.1.50svn64973-54.2.noarch.rpm"
RPM_HASH = "20ba2ecdfbed1d56aaab4944d16e4df63b805e00e9d80c8e7f2a61032b0cb6a6c129507cff277f192fe5a4fce5ec8004ad7b2bad1e9091ce121b2bfc7708ee53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
