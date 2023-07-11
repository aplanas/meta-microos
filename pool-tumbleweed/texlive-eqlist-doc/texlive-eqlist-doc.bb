SUMMARY = "Documentation for texlive-eqlist"
DESCRIPTION = "This package includes the documentation for texlive-eqlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32257"

RPM_NAME = "texlive-eqlist-doc-2023.201.2.1svn32257-53.2.noarch.rpm"
RPM_HASH = "940d521d0884a39ac730a402e43dce477142520bcd35a61244f9662b983bc2532618d90a25552c4cdd1a786ff5e040e9c3121c1f1f5e13038201e179ee713b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
