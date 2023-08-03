SUMMARY = "Documentation for texlive-protex"
DESCRIPTION = "This package includes the documentation for texlive-protex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn41633"

RPM_NAME = "texlive-protex-doc-2023.209.svn41633-53.1.noarch.rpm"
RPM_HASH = "5e5d6197fe763299f96ae482dac834170d6ed444e5394813fdb2c14c6b3d59ff5975fdd85f0bf5ef8a371da0b560c895c3a2084aadb8fb17f8315a0a653ddfb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-protex-doc"

RDEPENDS:${PN} += ""

inherit rpm
