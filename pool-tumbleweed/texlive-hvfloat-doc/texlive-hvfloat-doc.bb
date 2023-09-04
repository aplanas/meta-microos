SUMMARY = "Documentation for texlive-hvfloat"
DESCRIPTION = "This package includes the documentation for texlive-hvfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.45svn65671"

RPM_NAME = "texlive-hvfloat-doc-2023.209.2.45svn65671-54.1.noarch.rpm"
RPM_HASH = "cbc729b969d3da91f6f95c5ebf8b6b0ad0a9f12cff2e2d03c9d8b7691990b65468bed03e9a9840d41494032ff32a415da0490e64bd3cfdb9773187de57f9b58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvfloat-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
