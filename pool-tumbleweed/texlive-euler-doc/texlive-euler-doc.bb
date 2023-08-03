SUMMARY = "Documentation for texlive-euler"
DESCRIPTION = "This package includes the documentation for texlive-euler"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn42428"

RPM_NAME = "texlive-euler-doc-2023.209.2.5svn42428-53.1.noarch.rpm"
RPM_HASH = "b0e8e4d34d32f39ab72d695ae648223257be6b1b7a65ea937ca47c94c6697a91c074800c349bbae1eb655da292325586f98c609e77749e40cd239e98c2b0afee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euler-doc"

RDEPENDS:${PN} += ""

inherit rpm
