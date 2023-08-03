SUMMARY = "Documentation for texlive-amstex"
DESCRIPTION = "This package includes the documentation for texlive-amstex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn66186"

RPM_NAME = "texlive-amstex-doc-2023.209.2.01svn66186-55.1.noarch.rpm"
RPM_HASH = "7f2c5a05e357fe3ed4087c5d9567ffe760638b96bc45280eea0f57a173554834cdd7c247e80d448c5bb67d34ef75d1f6c6d9a88d61908e6f0736c21a73c4c57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-amstex.1 \
texlive-amstex-doc"

RDEPENDS:${PN} += ""

inherit rpm
