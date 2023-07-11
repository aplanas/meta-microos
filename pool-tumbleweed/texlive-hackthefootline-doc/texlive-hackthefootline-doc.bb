SUMMARY = "Documentation for texlive-hackthefootline"
DESCRIPTION = "This package includes the documentation for texlive-hackthefootline"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46494"

RPM_NAME = "texlive-hackthefootline-doc-2023.201.svn46494-53.2.noarch.rpm"
RPM_HASH = "ebfae106422c4463e38707f1c4ba0915f453107fe68c659d61946e243b2cab8df574aa3de1ca1a9bbb75ac6f4911bff394d59e9aed6b201b188fdd50c139e058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hackthefootline-doc"

RDEPENDS:${PN} += ""

inherit rpm
