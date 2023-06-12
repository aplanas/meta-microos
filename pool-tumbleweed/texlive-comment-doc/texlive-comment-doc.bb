SUMMARY = "Documentation for texlive-comment"
DESCRIPTION = "This package includes the documentation for texlive-comment"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.8svn41927"

RPM_NAME = "texlive-comment-doc-2023.201.3.8svn41927-53.1.noarch.rpm"
RPM_HASH = "1a044d3538315b8e3833785b5286ff9e64844e7c254568f6501153f4cbda5a7de6223c61af6c620d065836570a616ed2d97a8720b7caccd0ce47449852f4c2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comment-doc"
RDEPENDS:${PN} += ""

inherit rpm
