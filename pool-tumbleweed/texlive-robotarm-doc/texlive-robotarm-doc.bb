SUMMARY = "Documentation for texlive-robotarm"
DESCRIPTION = "This package includes the documentation for texlive-robotarm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-doc-2023.201.0.0.1svn63116-53.1.noarch.rpm"
RPM_HASH = "d529dd7e8c5764d6f53fb694a7751abe1f0eb65f642d9ffbbe82060b9a8b522fcd9e92aaf087399d92bcfc2ed6a58636b70a44406c42aedd414872b94d4932af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robotarm-doc"
RDEPENDS:${PN} += ""

inherit rpm
