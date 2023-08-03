SUMMARY = "Documentation for texlive-ticollege"
DESCRIPTION = "This package includes the documentation for texlive-ticollege"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36306"

RPM_NAME = "texlive-ticollege-doc-2023.209.1.0svn36306-55.1.noarch.rpm"
RPM_HASH = "59a011df0effdb402fafa76e7c913516c3869ba5eaffe966d66a3d9a13a25d37e8f1a26ebdf2c47740df51cbe2795713457564162bf3dd6a44f2286b80d9c6f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ticollege-doc-fr \
texlive-ticollege-doc"

RDEPENDS:${PN} += ""

inherit rpm
