SUMMARY = "Documentation for texlive-punk"
DESCRIPTION = "This package includes the documentation for texlive-punk"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn27388"

RPM_NAME = "texlive-punk-doc-2023.209.svn27388-54.2.noarch.rpm"
RPM_HASH = "20ba907c0e85654d282246d46269c9af9cc3309145d49ae0b51f50a5834a17580be85aa92817f4cf15506e18df5473845bcaebcd4488989859cfe95e05cc386d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-doc"

RDEPENDS:${PN} += ""

inherit rpm
