SUMMARY = "Documentation for texlive-esieecv"
DESCRIPTION = "This package includes the documentation for texlive-esieecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59638"

RPM_NAME = "texlive-esieecv-doc-2023.201.svn59638-53.2.noarch.rpm"
RPM_HASH = "18da4781823d97041fdef03efc1d3720fa80ce08ee9d1efa2b96d881f88167685aa324e2e514baa53b5968963db32f936a5710f5c4f0dc5edbc0f6185682c69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esieecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
