SUMMARY = "Documentation for texlive-graphviz"
DESCRIPTION = "This package includes the documentation for texlive-graphviz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-doc-2023.201.0.0.94svn31517-53.2.noarch.rpm"
RPM_HASH = "7634b03577634f0f12346eb5f311017e5c085bf3747cac6a98ff190e5b160bf9bb368c5fc3f60f61f5d6439337b18b6eb94ea404e6e2ac1d6fffb89fee8e4d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphviz-doc"

RDEPENDS:${PN} += ""

inherit rpm
