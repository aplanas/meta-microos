SUMMARY = "Documentation for texlive-uestcthesis"
DESCRIPTION = "This package includes the documentation for texlive-uestcthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn36371"

RPM_NAME = "texlive-uestcthesis-doc-2023.201.1.1.0svn36371-53.1.noarch.rpm"
RPM_HASH = "aa4bc34a5ae1c1beca3381a0fb20bc1380babf2e43e887b200b78852a0586d5602928032b546bc3bc86a57d5afa83bd7198867ed6a25e48c8bf5a023877c520b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-uestcthesis-doc:zh) \
texlive-uestcthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
