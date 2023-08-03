SUMMARY = "Documentation for texlive-delim"
DESCRIPTION = "This package includes the documentation for texlive-delim"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn23974"

RPM_NAME = "texlive-delim-doc-2023.209.1.0svn23974-53.1.noarch.rpm"
RPM_HASH = "f79991fe070603e069e3210bde2d23c7018848ca224a16800d85d1b8bd18ae44286a0700eee05b515a876aca58764e41d7406df5c55034a80c48d7ab3481c316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delim-doc"

RDEPENDS:${PN} += ""

inherit rpm
