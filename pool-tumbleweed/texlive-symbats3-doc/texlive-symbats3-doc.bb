SUMMARY = "Documentation for texlive-symbats3"
DESCRIPTION = "This package includes the documentation for texlive-symbats3"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63833"

RPM_NAME = "texlive-symbats3-doc-2023.209.svn63833-58.1.noarch.rpm"
RPM_HASH = "4dfdc4cccefb70b2ac7173d3b4467e331670183b76a8a52d7711353133f3cb3afd60b082cb770d0b3ad8c94fc19768be497549d7628f37c7360e2c0d69a3e22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-symbats3-doc"

RDEPENDS:${PN} += ""

inherit rpm
