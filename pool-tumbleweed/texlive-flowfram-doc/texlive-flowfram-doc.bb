SUMMARY = "Documentation for texlive-flowfram"
DESCRIPTION = "This package includes the documentation for texlive-flowfram"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn35291"

RPM_NAME = "texlive-flowfram-doc-2023.201.1.17svn35291-52.1.noarch.rpm"
RPM_HASH = "db27be7d764d35c4af08c90d271bc503c23ebc7caa380d1ff4cac477b6d5b0c6012c6040345ffd1a227502d95bf9eb70f9a7b1ecbded1e2ec3515df3d608a5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flowfram-doc"

RDEPENDS:${PN} += ""

inherit rpm
