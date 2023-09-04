SUMMARY = "Documentation for texlive-yaletter"
DESCRIPTION = "This package includes the documentation for texlive-yaletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42830"

RPM_NAME = "texlive-yaletter-doc-2023.209.1.1svn42830-53.2.noarch.rpm"
RPM_HASH = "fc044270a9a777099cd6ed8dfde241abaf2aae35b6e0b964a37198e6bf2486d941a8122bdfdd25db9b5662c9f692727b273fa67e63fc799ce74eb58ce139dddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
