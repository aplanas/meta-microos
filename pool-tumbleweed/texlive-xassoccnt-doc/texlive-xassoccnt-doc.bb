SUMMARY = "Documentation for texlive-xassoccnt"
DESCRIPTION = "This package includes the documentation for texlive-xassoccnt"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-doc-2023.201.2.0svn61112-52.1.noarch.rpm"
RPM_HASH = "55a2f4e021262a4aedbfb4709a25ea50246766692e00569612d92dfa0342fca6e5b216eb9e3fdfdcae32e02bebd6c7984e06d547df3b522ca21203648c11429b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xassoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
