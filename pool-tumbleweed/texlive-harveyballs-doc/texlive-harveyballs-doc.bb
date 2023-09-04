SUMMARY = "Documentation for texlive-harveyballs"
DESCRIPTION = "This package includes the documentation for texlive-harveyballs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn32003"

RPM_NAME = "texlive-harveyballs-doc-2023.209.1.1svn32003-54.2.noarch.rpm"
RPM_HASH = "5746a4dccf36b62a28a3c00c06260a6dc76ada632ea76d865903bed8b10ac55f0f1d657f0162e65e325304316407397ac545bd8d71c15255e5a0047abbca5516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harveyballs-doc"

RDEPENDS:${PN} += ""

inherit rpm
