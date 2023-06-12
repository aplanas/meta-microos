SUMMARY = "Documentation for texlive-ptolemaicastronomy"
DESCRIPTION = "This package includes the documentation for texlive-ptolemaicastronomy"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-doc-2023.201.1.0svn50810-53.1.noarch.rpm"
RPM_HASH = "3f45de989952b5c91be8d00b67c4906b1f318c84d8528d0703eecbeef25475cce0f96226e03d2810919977ee241bf1ec8098b30a66ec9fbd396d2f018f3c44c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptolemaicastronomy-doc"
RDEPENDS:${PN} += ""

inherit rpm
