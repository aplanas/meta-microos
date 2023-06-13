SUMMARY = "Documentation for texlive-blowup"
DESCRIPTION = "This package includes the documentation for texlive-blowup"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn64466"

RPM_NAME = "texlive-blowup-doc-2023.201.2.1.0svn64466-52.1.noarch.rpm"
RPM_HASH = "7df97e677f20448acddbcab86187168b95210e5322f745768fac86444241c351e3f76eb1b3d51d16f58bfc7d65304cd84c8eaa13f0bfac95c090582172bb531c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blowup-doc"

RDEPENDS:${PN} += ""

inherit rpm
