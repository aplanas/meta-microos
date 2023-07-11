SUMMARY = "Documentation for texlive-inlinedef"
DESCRIPTION = "This package includes the documentation for texlive-inlinedef"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-inlinedef-doc-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "13ce71ea570d188b83b3ec2b465bfb174d51d82f304e2d52644ee5a6158e60d579ecc5c3416370a74c82c4892864263220df3f5d161b9b6ec4848dc1c79e5341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinedef-doc"

RDEPENDS:${PN} += ""

inherit rpm
