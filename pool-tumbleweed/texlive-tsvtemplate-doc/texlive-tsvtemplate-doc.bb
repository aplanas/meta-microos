SUMMARY = "Documentation for texlive-tsvtemplate"
DESCRIPTION = "This package includes the documentation for texlive-tsvtemplate"
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.0svn65333"

RPM_NAME = "texlive-tsvtemplate-doc-2023.209.2022_1.0svn65333-53.1.noarch.rpm"
RPM_HASH = "c23043fbaa014edf0296972fbbb60f6bda46447d30e834f4b28aee7a13821236449e80f20862346e5201b0e4e1036658c96104e808570b949db0f5400c4683e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tsvtemplate-doc"

RDEPENDS:${PN} += ""

inherit rpm
