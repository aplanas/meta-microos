SUMMARY = "Documentation for texlive-schooldocs"
DESCRIPTION = "This package includes the documentation for texlive-schooldocs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65650"

RPM_NAME = "texlive-schooldocs-doc-2023.209.1.2svn65650-54.1.noarch.rpm"
RPM_HASH = "0ae5f5b2483a1a9cb8a5197063727edf3edd0a9585fb3e73422156867bf0e2570393a5a847ff82955bcfe8707908e747af035b777e2a92df043abb2830b3ab20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schooldocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
