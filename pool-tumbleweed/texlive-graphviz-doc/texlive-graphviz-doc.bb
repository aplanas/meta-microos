SUMMARY = "Documentation for texlive-graphviz"
DESCRIPTION = "This package includes the documentation for texlive-graphviz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-doc-2023.209.0.0.94svn31517-54.1.noarch.rpm"
RPM_HASH = "82e9172c3da653210e1b417dac79590064b8597e12fe550972ab9a0e5db8467743ddd6fd2a465478ffa0d1f9f68e8b14a0c57523b7377b6eb9b0542aea623fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphviz-doc"

RDEPENDS:${PN} += ""

inherit rpm
