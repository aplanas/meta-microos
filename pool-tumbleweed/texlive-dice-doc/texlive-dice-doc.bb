SUMMARY = "Documentation for texlive-dice"
DESCRIPTION = "This package includes the documentation for texlive-dice"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28501"

RPM_NAME = "texlive-dice-doc-2023.209.svn28501-53.1.noarch.rpm"
RPM_HASH = "6ba7f1a543acb8924b4451a69cab4b9db5ee1c6f62f7bb5238c5f92828ae91f3e6f3b3319b68e66a115da229f9da4ce75dcaba806e12e606343ecbd34322ad23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dice-doc"

RDEPENDS:${PN} += ""

inherit rpm
