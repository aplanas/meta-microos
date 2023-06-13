SUMMARY = "Documentation for texlive-avremu"
DESCRIPTION = "This package includes the documentation for texlive-avremu"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn35373"

RPM_NAME = "texlive-avremu-doc-2023.201.0.0.1svn35373-53.1.noarch.rpm"
RPM_HASH = "42dcdf1c47737db404bb25b2231e31ce442a5a7f7b81362ddd4f61eeff5ff3bda936872effa4aff50c9a2c580152df3ec8ff58bc2470a2fa9dd6e1da82ec6c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-avremu-doc"

RDEPENDS:${PN} += ""

inherit rpm
