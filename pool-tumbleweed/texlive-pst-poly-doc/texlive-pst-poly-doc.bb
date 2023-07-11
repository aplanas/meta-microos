SUMMARY = "Documentation for texlive-pst-poly"
DESCRIPTION = "This package includes the documentation for texlive-pst-poly"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.63svn35062"

RPM_NAME = "texlive-pst-poly-doc-2023.201.1.63svn35062-53.2.noarch.rpm"
RPM_HASH = "73984c13bd7c08e72f475de3e8630344187d235b3c727fd27081fd66a3a1dfb5cc7e0e37dbc08babbed1f9d53da9f113fbf1b79f9d9a2b72186f09acee8cd640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poly-doc"

RDEPENDS:${PN} += ""

inherit rpm
