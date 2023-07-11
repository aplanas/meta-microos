SUMMARY = "Documentation for texlive-rgltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-rgltxdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-doc-2023.201.1.3svn53858-53.2.noarch.rpm"
RPM_HASH = "17c39159ef8ddcbe750552a930f19554851f1396862d3276652e3c10aec32eb73804992136ce9fe31612119504d5ea87bc1517321cc11da867d58c7823901d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rgltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
