SUMMARY = "Documentation for texlive-pkfix-helper"
DESCRIPTION = "This package includes the documentation for texlive-pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn56061"

RPM_NAME = "texlive-pkfix-helper-doc-2023.209.1.6svn56061-52.1.noarch.rpm"
RPM_HASH = "65beac0940a79a0211239d28b461f83ea9c6c31b7c24131c9cc709b9191da3336e597d501a378dd58ee6b5c7295bd0ce779daeb9b2f647dbfd3d6f52775fc9cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pkfix-helper.1 \
texlive-pkfix-helper-doc"

RDEPENDS:${PN} += ""

inherit rpm
