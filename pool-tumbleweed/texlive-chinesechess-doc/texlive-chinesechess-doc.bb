SUMMARY = "Documentation for texlive-chinesechess"
DESCRIPTION = "This package includes the documentation for texlive-chinesechess"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn63276"

RPM_NAME = "texlive-chinesechess-doc-2023.209.1.2.0svn63276-54.1.noarch.rpm"
RPM_HASH = "7a8a074734c155e7f0d98b05f0d672d819d39fe6579866e220c903e19ff382165e510e33b590c0229b543b709977cc4a8e9735c1c3c0f0f82927329fed9b7d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chinesechess-doc-zh \
texlive-chinesechess-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
