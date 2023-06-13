SUMMARY = "Documentation for texlive-gates"
DESCRIPTION = "This package includes the documentation for texlive-gates"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn29803"

RPM_NAME = "texlive-gates-doc-2023.201.0.0.2svn29803-52.1.noarch.rpm"
RPM_HASH = "017bb74c23cd7c3ce408baa392c7f40cc3c457bcbfa111a157382979953da49138daabf9fe28495e148e22656014f330dbf6a893825147f42e00794217b0ae92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gates-doc"

RDEPENDS:${PN} += ""

inherit rpm
