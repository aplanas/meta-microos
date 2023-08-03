SUMMARY = "Documentation for texlive-serbian-def-cyr"
DESCRIPTION = "This package includes the documentation for texlive-serbian-def-cyr"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23734"

RPM_NAME = "texlive-serbian-def-cyr-doc-2023.209.svn23734-54.1.noarch.rpm"
RPM_HASH = "4f5e76413d23af8f55d5713407392fb0f2a54007c57443584be682558f106ec94ad43a248735a8c85b8715e07ecee5c45466d45d3130da04ba0b0150ad8dc06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-def-cyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
