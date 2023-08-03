SUMMARY = "Documentation for texlive-finstrut"
DESCRIPTION = "This package includes the documentation for texlive-finstrut"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn21719"

RPM_NAME = "texlive-finstrut-doc-2023.209.0.0.5svn21719-53.1.noarch.rpm"
RPM_HASH = "b60422892d5f418b4cde8d963f836a9754fe0b7683936974b18252623fac75fef4a5112d14b882fdfdf02c31cfd8654a4e58698fba1b86b665adecd57d532d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-finstrut-doc"

RDEPENDS:${PN} += ""

inherit rpm
