SUMMARY = "Documentation for texlive-luamesh"
DESCRIPTION = "This package includes the documentation for texlive-luamesh"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn63875"

RPM_NAME = "texlive-luamesh-doc-2023.201.0.0.7svn63875-52.1.noarch.rpm"
RPM_HASH = "acbff15d3a397521a7286d209af163c847a08368f4ad07fcc7eea74a81f70f93e514b8a27baeeedf8cd2039ee11451f574f786221b25649a32c6c1e48ee284d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamesh-doc"

RDEPENDS:${PN} += ""

inherit rpm
