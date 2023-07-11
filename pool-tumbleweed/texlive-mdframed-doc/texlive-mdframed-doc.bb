SUMMARY = "Documentation for texlive-mdframed"
DESCRIPTION = "This package includes the documentation for texlive-mdframed"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.9bsvn31075"

RPM_NAME = "texlive-mdframed-doc-2023.208.1.9bsvn31075-53.1.noarch.rpm"
RPM_HASH = "72393c09cc1916e8fa8e1283fa13bfef6f15b59981fe084909e172dd981179c38f0ae75b9c55c07e9dec41cfa8f18130019abbc73628273d1094735fff51935e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdframed-doc"

RDEPENDS:${PN} += ""

inherit rpm
