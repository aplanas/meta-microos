SUMMARY = "Documentation for texlive-hulipsum"
DESCRIPTION = "This package includes the documentation for texlive-hulipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56848"

RPM_NAME = "texlive-hulipsum-doc-2023.201.1.1svn56848-52.1.noarch.rpm"
RPM_HASH = "b75bcaaa1d10174d7532f4b9d25bfe7ae1fc20b1d168d12c81978d93e598a2d048b6913a00698ffc702d346a8ad33d555eb8703365a9cf81d3fc4859ab061f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hulipsum-doc"
RDEPENDS:${PN} += ""

inherit rpm
