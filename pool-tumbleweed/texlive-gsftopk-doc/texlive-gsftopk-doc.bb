SUMMARY = "Documentation for texlive-gsftopk"
DESCRIPTION = "This package includes the documentation for texlive-gsftopk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-doc-2023.209.1.19.2svn52851-54.2.noarch.rpm"
RPM_HASH = "505ac481d8eaf6a54de3c20c61c63283d2b6495fddd4bc0e9c2ffcd62d62544ad9b31140a83cab82f489db701c5a712639bdd20cd6d9c8339b74abe82af80308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-gsftopk.1 \
texlive-gsftopk-doc"

RDEPENDS:${PN} += ""

inherit rpm
