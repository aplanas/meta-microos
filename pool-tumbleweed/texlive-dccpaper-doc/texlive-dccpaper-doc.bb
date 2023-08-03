SUMMARY = "Documentation for texlive-dccpaper"
DESCRIPTION = "This package includes the documentation for texlive-dccpaper"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn61763"

RPM_NAME = "texlive-dccpaper-doc-2023.209.2.3svn61763-53.1.noarch.rpm"
RPM_HASH = "274549303f6bbd34664b7a1e566945bfe134c6e50e85e2f4bf07512f8ca1377cdbb6b9e9d34f70df3c7ef5ba0d36285c52f233fc2f223e33326e1f01cc7c84ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dccpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
