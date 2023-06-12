SUMMARY = "Documentation for texlive-hecthese"
DESCRIPTION = "This package includes the documentation for texlive-hecthese"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn60455"

RPM_NAME = "texlive-hecthese-doc-2023.201.1.5svn60455-53.1.noarch.rpm"
RPM_HASH = "cc39ecf945473ea4a47d1e107eed4b405c93c76433ed592be04dc390fab991ab675a9f61fa4ffbcc1d083a802f4e5d3b7c2023fad627b9a762f4b4d4db73e843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hecthese-doc:en;fr) \
texlive-hecthese-doc"
RDEPENDS:${PN} += ""

inherit rpm
