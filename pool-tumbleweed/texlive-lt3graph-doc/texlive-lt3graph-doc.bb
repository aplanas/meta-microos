SUMMARY = "Documentation for texlive-lt3graph"
DESCRIPTION = "This package includes the documentation for texlive-lt3graph"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1.9svn45913"

RPM_NAME = "texlive-lt3graph-doc-2023.208.0.0.1.9svn45913-53.1.noarch.rpm"
RPM_HASH = "602cf4da004d01a70010d2ef0809ae2811345d246bf8bcae41caee0e88cb2f8a5ceafd19b31d9d80cbb9c0fd5f48f48d39a0ac26b4613581f3965ea033f816cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3graph-doc"

RDEPENDS:${PN} += ""

inherit rpm
