SUMMARY = "Documentation for texlive-grfext"
DESCRIPTION = "This package includes the documentation for texlive-grfext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53024"

RPM_NAME = "texlive-grfext-doc-2023.209.1.3svn53024-54.1.noarch.rpm"
RPM_HASH = "8ca780a53859c953dcf585e55b0760b955b7ff914fd1d047ab9b6bbaefe8e9e22a26eb3a6104915948cdefc45db6aa6e2c30382dff2e58041d7ab84c2fa5e9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfext-doc"

RDEPENDS:${PN} += ""

inherit rpm
