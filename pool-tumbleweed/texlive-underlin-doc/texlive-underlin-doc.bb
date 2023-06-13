SUMMARY = "Documentation for texlive-underlin"
DESCRIPTION = "This package includes the documentation for texlive-underlin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-underlin-doc-2023.201.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "817ec2fcb06731cf851491d248ba223e0910e3b1700f324f6791ba5d2aaea0761b7fbab00c796fecd518b7ed1184b3368b1b07c3296391d66e3140bf2d627ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
