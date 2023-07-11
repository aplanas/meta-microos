SUMMARY = "Documentation for texlive-zhnumber"
DESCRIPTION = "This package includes the documentation for texlive-zhnumber"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn66115"

RPM_NAME = "texlive-zhnumber-doc-2023.201.3.0svn66115-52.2.noarch.rpm"
RPM_HASH = "0264986ccbbe0f8a31fb15ce48666d8a1001d7bef432ee9eea7d39f5579e9de056955a1fcf389a7a1b56874638f8fb320396b00f9e7b654edfca98dd2c0cc9e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhnumber-doc-zh \
texlive-zhnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
