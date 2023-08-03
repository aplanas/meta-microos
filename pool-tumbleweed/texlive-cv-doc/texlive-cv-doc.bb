SUMMARY = "Documentation for texlive-cv"
DESCRIPTION = "This package includes the documentation for texlive-cv"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cv-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "8964e2de0aac450ecc8c915e43e419bf16f269953601fb67f5e3c94070d62570735ae8eb10038a9ff45412e9c30f965c24dfae9d808ece2057937a98805468ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
