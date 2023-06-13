SUMMARY = "Documentation for texlive-bracketkey"
DESCRIPTION = "This package includes the documentation for texlive-bracketkey"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17129"

RPM_NAME = "texlive-bracketkey-doc-2023.201.1.0svn17129-52.1.noarch.rpm"
RPM_HASH = "f9570a6c6eb9091b7b37d16df9f2a10184eaf463e96774561ade9de2b444e0bbaec6c61c6377c6ffbdd4abbbb2804761f46500dc29b34a865191ba19cd6a1e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bracketkey-doc"

RDEPENDS:${PN} += ""

inherit rpm
