SUMMARY = "Documentation for texlive-glossaries-polish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-polish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "94419403d1c6277db56e51dbeaa1aedae75135e737c7f22885439529443daf91e185e6341dadc73a90739ab0f6d276b61e55f99ae9e732c81a96c4ee6597ba52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
