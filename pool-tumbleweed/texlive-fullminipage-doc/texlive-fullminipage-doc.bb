SUMMARY = "Documentation for texlive-fullminipage"
DESCRIPTION = "This package includes the documentation for texlive-fullminipage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.1svn34545"

RPM_NAME = "texlive-fullminipage-doc-2023.209.0.0.1.1svn34545-53.1.noarch.rpm"
RPM_HASH = "bd483b01988a7ab66c50b5bb4ceb9e6f4cc333c194f336d42f30c20c7a91415b82b41929a56efe7df436bd65986c103c0537bc0f4212126b6a7fa416b759f9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullminipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
