SUMMARY = "Documentation for texlive-tamefloats"
DESCRIPTION = "This package includes the documentation for texlive-tamefloats"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.42svn27345"

RPM_NAME = "texlive-tamefloats-doc-2023.201.0.0.42svn27345-54.1.noarch.rpm"
RPM_HASH = "6eb697d1aed460e0adbcce6826e31b32e41f78c0b734d085a78c5fa061e3245fb1bdcbe859210ed2ac50da48b20c5f12a43fb3ba65c0215d78159811b7ed4d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tamefloats-doc"

RDEPENDS:${PN} += ""

inherit rpm
