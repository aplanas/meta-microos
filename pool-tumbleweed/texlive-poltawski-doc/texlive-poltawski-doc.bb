SUMMARY = "Documentation for texlive-poltawski"
DESCRIPTION = "This package includes the documentation for texlive-poltawski"
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.101svn20075"

RPM_NAME = "texlive-poltawski-doc-2023.209.1.101svn20075-53.1.noarch.rpm"
RPM_HASH = "0562bcfb75c33a2e25983e7c6f409a187203be4560f470eeaf9b8083fc8b5491053379011e06c21eea641ace712e9cdaa51a7299d5ce3596b836dabcaf794b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poltawski-doc"

RDEPENDS:${PN} += ""

inherit rpm
