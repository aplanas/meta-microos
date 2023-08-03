SUMMARY = "Documentation for texlive-transparent"
DESCRIPTION = "This package includes the documentation for texlive-transparent"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn64852"

RPM_NAME = "texlive-transparent-doc-2023.209.1.5svn64852-53.1.noarch.rpm"
RPM_HASH = "7eff538d86489fe9ffbc453a4811a05a353800907c445a14cb6d79891868ff7343e1a5be0b30b12df1c7a4b297718590a6a35c6e4b8c9683228e9330a3e67168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-transparent-doc"

RDEPENDS:${PN} += ""

inherit rpm
