SUMMARY = "Documentation for texlive-babel-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-babel-hungarian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5csvn49701"

RPM_NAME = "texlive-babel-hungarian-doc-2023.209.1.5csvn49701-54.1.noarch.rpm"
RPM_HASH = "47b3bf388d10fd9fc7bca37ac157649dd0d8eccd858daac502316c91864b7142d5d9569b28b695f9b8f8200f4a3e7aaf1cd52a1e22161c46950b9ab20a156d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-hungarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
