SUMMARY = "Documentation for texlive-lambdax"
DESCRIPTION = "This package includes the documentation for texlive-lambdax"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn60278"

RPM_NAME = "texlive-lambdax-doc-2023.201.1.1svn60278-55.1.noarch.rpm"
RPM_HASH = "6c6c10c192493228b297d210d22b7c679aabc767616efd80e98a1a4216c385329faa393f7624a5e07dedd73a63a3bb5b6f5fe6e427b8020ff152c10d3588d2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lambdax-doc"

RDEPENDS:${PN} += ""

inherit rpm
