SUMMARY = "Documentation for texlive-xcntperchap"
DESCRIPTION = "This package includes the documentation for texlive-xcntperchap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-doc-2023.209.0.0.5svn54080-53.1.noarch.rpm"
RPM_HASH = "dcc12ff6c1c273d048570b43bb5aea64ff412089b31d10a81bb3abdf2a9d7a7097bb4cd46e5e79b905677dc1528b14d99e45045cf48b705db822d49c3648e98f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcntperchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
