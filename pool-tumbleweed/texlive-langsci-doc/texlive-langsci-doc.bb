SUMMARY = "Documentation for texlive-langsci"
DESCRIPTION = "This package includes the documentation for texlive-langsci"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65793"

RPM_NAME = "texlive-langsci-doc-2023.209.svn65793-56.1.noarch.rpm"
RPM_HASH = "308963b3ee6f09fc2e53444b028f2e836971e390600f205c1689b9635087f068280e336b6232a6afb972f7f27894aabca197bee924702f88e3a2b26f841a649a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langsci-doc"

RDEPENDS:${PN} += ""

inherit rpm
