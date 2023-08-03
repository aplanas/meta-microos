SUMMARY = "Documentation for texlive-germkorr"
DESCRIPTION = "This package includes the documentation for texlive-germkorr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-germkorr-doc-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "d9dafc207baacb344829da2b00a5882f7595d873e22d81e66a99606dd493110770fc64d86f260a5895e6910ab6023829e60c10ecb2cd2dbf0741b03c71137406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-germkorr-doc"

RDEPENDS:${PN} += ""

inherit rpm
