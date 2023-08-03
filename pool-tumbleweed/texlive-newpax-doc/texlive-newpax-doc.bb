SUMMARY = "Documentation for texlive-newpax"
DESCRIPTION = "This package includes the documentation for texlive-newpax"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.53svn64415"

RPM_NAME = "texlive-newpax-doc-2023.209.0.0.53svn64415-55.1.noarch.rpm"
RPM_HASH = "8580a85800a4f4ef0b8904f9936206f0f09190d4033a978c78a2fd35bfce4d4540d6eec9e15bc056fb022e355a277958143bb9abfd9e2111913b95838f34430c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newpax-doc"

RDEPENDS:${PN} += ""

inherit rpm
