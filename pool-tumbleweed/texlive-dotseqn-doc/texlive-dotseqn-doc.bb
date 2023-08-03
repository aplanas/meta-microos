SUMMARY = "Documentation for texlive-dotseqn"
DESCRIPTION = "This package includes the documentation for texlive-dotseqn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn17195"

RPM_NAME = "texlive-dotseqn-doc-2023.209.1.1svn17195-53.1.noarch.rpm"
RPM_HASH = "b7e71cd9de49e939ff28dee1bab6ddc38e1b990d2d05cd0c64631bbdf376324671ad0d731341dd535b9e0081122f99c3cd3fbbcde306330292bc78fa348735c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotseqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
