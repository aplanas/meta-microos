SUMMARY = "Documentation for texlive-biochemistry-colors"
DESCRIPTION = "This package includes the documentation for texlive-biochemistry-colors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn54512"

RPM_NAME = "texlive-biochemistry-colors-doc-2023.209.1.00svn54512-54.1.noarch.rpm"
RPM_HASH = "635de88404a690cd5ff075606d39a68d02686c0e638ad469a0be8a3dd28014be3759f4f1d8be3a56d19f98fcb1ff833ec4e0e8411efd71d865dfef596c9dad75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biochemistry-colors-doc"

RDEPENDS:${PN} += ""

inherit rpm
