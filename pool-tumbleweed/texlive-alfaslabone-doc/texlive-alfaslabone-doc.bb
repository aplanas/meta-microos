SUMMARY = "Documentation for texlive-alfaslabone"
DESCRIPTION = "This package includes the documentation for texlive-alfaslabone"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57452"

RPM_NAME = "texlive-alfaslabone-doc-2023.201.0.0.0.1svn57452-54.1.noarch.rpm"
RPM_HASH = "0c204e9a841e055ec963692e3a470341039d96f9f07640a73fc6f513d7b573ffcbc9087067d00647969e8f082f2206c80797a5791e33c50a7eb2f03f296d6978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alfaslabone-doc"

RDEPENDS:${PN} += ""

inherit rpm
