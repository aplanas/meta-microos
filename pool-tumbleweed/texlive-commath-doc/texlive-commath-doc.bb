SUMMARY = "Documentation for texlive-commath"
DESCRIPTION = "This package includes the documentation for texlive-commath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-commath-doc-2023.201.0.0.3svn15878-53.1.noarch.rpm"
RPM_HASH = "432ad73bb4df5ea923ee887ad869f0d1cf1cf7adcd11b1b16104738801b42a69d85e37849545d3300e2670a11892a895de0b578e3ba24d4a53f2e982de29b5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commath-doc"

RDEPENDS:${PN} += ""

inherit rpm
