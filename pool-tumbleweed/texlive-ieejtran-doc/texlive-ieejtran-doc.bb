SUMMARY = "Documentation for texlive-ieejtran"
DESCRIPTION = "This package includes the documentation for texlive-ieejtran"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn65641"

RPM_NAME = "texlive-ieejtran-doc-2023.209.0.0.19svn65641-54.1.noarch.rpm"
RPM_HASH = "79d64275e37e96b02d385168657c70db5aa291a9cc74a7178665ce85234fb9cd543193e742a3284e516d330595c90afeba22b08c01b70a96055845c5013b6422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ieejtran-doc-ja \
texlive-ieejtran-doc"

RDEPENDS:${PN} += ""

inherit rpm
