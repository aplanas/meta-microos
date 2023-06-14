SUMMARY = "Documentation for texlive-bgteubner"
DESCRIPTION = "This package includes the documentation for texlive-bgteubner"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn54080"

RPM_NAME = "texlive-bgteubner-doc-2023.201.2.11svn54080-53.1.noarch.rpm"
RPM_HASH = "45555254ba74f61531bb79ec9411afe805016f7a412f42ff3aa3d6953d9a3cc26da2801fe3fd8cbaef47af8b5c6658e3c50122ad62f21eab92ec1b4ce2abca6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bgteubner-doc-de \
texlive-bgteubner-doc"

RDEPENDS:${PN} += ""

inherit rpm
