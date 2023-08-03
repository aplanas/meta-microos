SUMMARY = "Documentation for texlive-gzt"
DESCRIPTION = "This package includes the documentation for texlive-gzt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.3svn63591"

RPM_NAME = "texlive-gzt-doc-2023.209.1.1.3svn63591-54.1.noarch.rpm"
RPM_HASH = "d089b8af5745ee09454c7b59536a65acae9ea03a5b3320e46e40fc184c430892b1cbc67d5d02d2d34da8dceceb8ed4b32f36b34f30000fb0ef4019dc421f9531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gzt-doc-fr \
texlive-gzt-doc"

RDEPENDS:${PN} += ""

inherit rpm
