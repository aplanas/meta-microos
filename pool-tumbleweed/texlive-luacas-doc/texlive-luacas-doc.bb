SUMMARY = "Documentation for texlive-luacas"
DESCRIPTION = "This package includes the documentation for texlive-luacas"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn65042"

RPM_NAME = "texlive-luacas-doc-2023.201.1.0.1svn65042-52.1.noarch.rpm"
RPM_HASH = "501b7c5e79404777906dfe3c240e960806368e233b088799235adeb6e4bfd1b949ead66eb432fc1a2e69c91d7beeda55b8995b5a78e14f273c9c24b6354a5801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacas-doc"

RDEPENDS:${PN} += ""

inherit rpm
