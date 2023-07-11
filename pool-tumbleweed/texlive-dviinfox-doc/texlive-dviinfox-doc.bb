SUMMARY = "Documentation for texlive-dviinfox"
DESCRIPTION = "This package includes the documentation for texlive-dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn59216"

RPM_NAME = "texlive-dviinfox-doc-2023.201.1.06svn59216-53.2.noarch.rpm"
RPM_HASH = "ed461b27174bd9d314c9e290e6f1c713681cd4ee0c37a65b4a29c2d7ce7ed8a3391856d47d7032fbb5a7c1429ecc52d14ddb3bcb154c4f2e2e6d843368947e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox-doc"

RDEPENDS:${PN} += ""

inherit rpm
