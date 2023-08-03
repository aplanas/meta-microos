SUMMARY = "Documentation for texlive-babel-kurmanji"
DESCRIPTION = "This package includes the documentation for texlive-babel-kurmanji"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30279"

RPM_NAME = "texlive-babel-kurmanji-doc-2023.209.1.1svn30279-54.1.noarch.rpm"
RPM_HASH = "f05503ea55fb04bdac5926a2df59b0cf4b52ba7da4b66fdd88aab526c2ac8f08dc1a2434caff9757cf34ca65c38a1f9ed9571aeb852c56a3c4a9c60ca41cff61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-kurmanji-doc"

RDEPENDS:${PN} += ""

inherit rpm
