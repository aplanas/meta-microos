SUMMARY = "Documentation for texlive-bmstu"
DESCRIPTION = "This package includes the documentation for texlive-bmstu"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn65897"

RPM_NAME = "texlive-bmstu-doc-2023.209.2.0.0svn65897-53.1.noarch.rpm"
RPM_HASH = "6b77bbb7c219c6cc12b0e760137005fff08ceda2e5244f15adb23f4bb8c50b4dcfd5bc122efe75af46fd043900d52ec1acb17a96ecf81ff84bd7de2e2010158e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bmstu-doc"

RDEPENDS:${PN} += ""

inherit rpm
