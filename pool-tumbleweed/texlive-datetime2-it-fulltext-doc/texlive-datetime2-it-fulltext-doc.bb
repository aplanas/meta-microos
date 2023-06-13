SUMMARY = "Documentation for texlive-datetime2-it-fulltext"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-it-fulltext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54779"

RPM_NAME = "texlive-datetime2-it-fulltext-doc-2023.201.1.6svn54779-52.1.noarch.rpm"
RPM_HASH = "d4cdf6c171da90a2fc19df6b6e64a81d02f0506e600c71d24d020af1440bec2b169c8d476a4b664f7d07e46b7905785c60b95d4785b277f61a1cf0eae7e31e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-it-fulltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
