SUMMARY = "Documentation for texlive-garamond-libre"
DESCRIPTION = "This package includes the documentation for texlive-garamond-libre"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn64412"

RPM_NAME = "texlive-garamond-libre-doc-2023.201.1.4svn64412-52.1.noarch.rpm"
RPM_HASH = "ef947f9733f341d5acc14904ae8364ad0b968941a052b5db26507d1e000cbe1b047beb484d23da35d8dabc8687599eb641618c99f363afc4491b9730105b9894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-libre-doc"

RDEPENDS:${PN} += ""

inherit rpm
