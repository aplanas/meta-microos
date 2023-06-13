SUMMARY = "Documentation for texlive-isopt"
DESCRIPTION = "This package includes the documentation for texlive-isopt"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn45509"

RPM_NAME = "texlive-isopt-doc-2023.201.0.0.01svn45509-55.1.noarch.rpm"
RPM_HASH = "fcea2c860bf97244129b1c75e72f56d2dc65161e10ce4d2c566e90a5737dc89aa8448937f231382b94782802aee5f5f849c41a74d735f4b8e096bc0b6c72e994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
