SUMMARY = "Documentation for texlive-yafoot"
DESCRIPTION = "This package includes the documentation for texlive-yafoot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48568"

RPM_NAME = "texlive-yafoot-doc-2023.201.1.1svn48568-52.1.noarch.rpm"
RPM_HASH = "ff938af4643bd42deac8984484502244ef56f723f1c1718652aaede840a76a6a1c1268e7392e578f67d74799390ca92095f32caec66f24f9a208e3d1d2e9442c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yafoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
