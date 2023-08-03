SUMMARY = "Documentation for texlive-babel-czech"
DESCRIPTION = "This package includes the documentation for texlive-babel-czech"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1asvn30261"

RPM_NAME = "texlive-babel-czech-doc-2023.209.3.1asvn30261-54.1.noarch.rpm"
RPM_HASH = "b3f50d4a26ae08e8a5cc9fc7bee49f6f548ef88ce0ca19697aa5ed9221239f20360ecffd8596ef84587b823e556dd64e77eca14dbcdd8a9e2409e3d59900cc31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-czech-doc"

RDEPENDS:${PN} += ""

inherit rpm
