SUMMARY = "Documentation for texlive-bibtopicprefix"
DESCRIPTION = "This package includes the documentation for texlive-bibtopicprefix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn15878"

RPM_NAME = "texlive-bibtopicprefix-doc-2023.209.1.10svn15878-54.1.noarch.rpm"
RPM_HASH = "082672796df2d76c95b065712b6a26fd2ebc2aae083d8c15b821f3b350bca0565b3143fb38cbc869692a0ef7e84e9ff7e0700f44f3055f5adbd5346719f1f1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtopicprefix-doc"

RDEPENDS:${PN} += ""

inherit rpm
