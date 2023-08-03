SUMMARY = "Documentation for texlive-snapshot"
DESCRIPTION = "This package includes the documentation for texlive-snapshot"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn56735"

RPM_NAME = "texlive-snapshot-doc-2023.209.2.14svn56735-58.1.noarch.rpm"
RPM_HASH = "a335c4913243fdc1effdf51d81e0a8a6306e43b89d343602859dd68cec53df96b39b847e0ef331623c5782e53b9992970a70b3b12d7b407038b73a407f82c1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snapshot-doc"

RDEPENDS:${PN} += ""

inherit rpm
