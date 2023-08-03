SUMMARY = "Documentation for texlive-datetime2-finnish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn47047"

RPM_NAME = "texlive-datetime2-finnish-doc-2023.209.1.2svn47047-53.1.noarch.rpm"
RPM_HASH = "310bba126b8b10d2a7556b663b5a17f4db1c022bdc2062e5f464a85e573a98d5cae921653890840bddcddce9545de1f4b1bab432a737dbbc779dce5ad7ce003b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
