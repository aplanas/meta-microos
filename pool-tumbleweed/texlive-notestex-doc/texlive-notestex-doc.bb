SUMMARY = "Documentation for texlive-notestex"
DESCRIPTION = "This package includes the documentation for texlive-notestex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45396"

RPM_NAME = "texlive-notestex-doc-2023.209.1.0svn45396-55.1.noarch.rpm"
RPM_HASH = "886193e0f70818ac3b7c580832aeb79e3758b6f70a50010ee9fafb595d2afc673b7a21a5a0a54fc071f89e697eb0e71fe7f78bb1a41c2e6cd6fa96d21febe1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notestex-doc"

RDEPENDS:${PN} += ""

inherit rpm
