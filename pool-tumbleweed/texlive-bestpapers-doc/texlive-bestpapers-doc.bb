SUMMARY = "Documentation for texlive-bestpapers"
DESCRIPTION = "This package includes the documentation for texlive-bestpapers"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn38708"

RPM_NAME = "texlive-bestpapers-doc-2023.201.1.0svn38708-53.1.noarch.rpm"
RPM_HASH = "9d6bed586e11f4908c9f6925cbe25a8ccbbc5ab0413003a71ffa420c0c6fd47c694b20cf6367ede24e2a3c37a9aec386a070440cd3351db7b6d0274908e0d700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bestpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
