SUMMARY = "Documentation for texlive-anonchap"
DESCRIPTION = "This package includes the documentation for texlive-anonchap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn17049"

RPM_NAME = "texlive-anonchap-doc-2023.201.1.1asvn17049-54.1.noarch.rpm"
RPM_HASH = "444c39f7795eec2c9266c72e582624f0761972925cb559a6178b5fc59263f5c9d540820953b4bdebdc76ab78ca6d6b7c50181780762c394fce92310d78e8c764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
