SUMMARY = "Documentation for texlive-datetime2-estonian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47565"

RPM_NAME = "texlive-datetime2-estonian-doc-2023.209.1.1svn47565-53.1.noarch.rpm"
RPM_HASH = "a12a52f15b91f833f32358b100b2cd69fd8e7f9a2de65d5e66359254445508589bc90c9a5bdd6b3805053a16425d990d7caa5d21e4ce1b0463a816efe1006db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
