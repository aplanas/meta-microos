SUMMARY = "Documentation for texlive-pst-labo"
DESCRIPTION = "This package includes the documentation for texlive-pst-labo"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.04svn39077"

RPM_NAME = "texlive-pst-labo-doc-2023.201.2.04svn39077-52.1.noarch.rpm"
RPM_HASH = "b4c74c670c1a8c901029e6edb857ac7ed7a54fe42e737228ee97257da86d829f3f5d8ef1ce59b69031bebddbd5b25b507d5ef9e2268579925f96276ccbb3b2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-labo-doc"

RDEPENDS:${PN} += ""

inherit rpm
