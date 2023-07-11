SUMMARY = "Documentation for texlive-zhmetrics-uptex"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics-uptex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-doc-2023.201.1.0svn40728-52.2.noarch.rpm"
RPM_HASH = "6596e6c7008491707a39c958ade464b4645988313cfa60e2d42d5b7aa72df1b2d129ab7ad70f3c99541e1d1641f5e60f23e947115f82cb26a518196de13dea2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-uptex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
