SUMMARY = "Documentation for texlive-xpatch"
DESCRIPTION = "This package includes the documentation for texlive-xpatch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-doc-2023.209.0.0.3svn54563-53.1.noarch.rpm"
RPM_HASH = "dea96d7c45d938300dfbf4c0062fa01b6e0ac786e0bef1ee933da054b3e2e318689a6aa413fe8f8ac1dfc465f5bbb764eafe153b0e72645c47abe03a7393057d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
