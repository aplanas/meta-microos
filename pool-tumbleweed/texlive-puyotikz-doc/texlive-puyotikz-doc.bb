SUMMARY = "Documentation for texlive-puyotikz"
DESCRIPTION = "This package includes the documentation for texlive-puyotikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-doc-2023.209.1.0.1svn57254-54.1.noarch.rpm"
RPM_HASH = "b5d13ae2d11164a7a8f395357e99a731d0edc67da5bc093559fc63c0fd290f371d789e20e3d44dd1ecdb044cf5df27943e316b8740a1ed4fc2919d01adff52ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-puyotikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
