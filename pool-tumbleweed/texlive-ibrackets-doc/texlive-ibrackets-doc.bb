SUMMARY = "Documentation for texlive-ibrackets"
DESCRIPTION = "This package includes the documentation for texlive-ibrackets"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65383"

RPM_NAME = "texlive-ibrackets-doc-2023.209.1.1svn65383-54.1.noarch.rpm"
RPM_HASH = "5c714db78759585a0a4b90de6813e4c212372667b09dcdaa15ab642abab044eabb8482d3b046b4f9f822f82c39f021fc73eae481775adc8a378dd116b26c1df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibrackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
