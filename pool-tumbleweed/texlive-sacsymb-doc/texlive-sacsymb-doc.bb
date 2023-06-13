SUMMARY = "Documentation for texlive-sacsymb"
DESCRIPTION = "This package includes the documentation for texlive-sacsymb"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65768"

RPM_NAME = "texlive-sacsymb-doc-2023.201.svn65768-53.1.noarch.rpm"
RPM_HASH = "a5ef88c49b8e1ac75a1543cc4b78b8ccd3ee7a907c0023006c7cfa2bbc830ef9704a81f464f0d171f3341889f65bb502a7600b666d9811cb6990a752201a44f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sacsymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
