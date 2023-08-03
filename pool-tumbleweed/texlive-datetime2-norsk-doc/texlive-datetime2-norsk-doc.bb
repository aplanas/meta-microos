SUMMARY = "Documentation for texlive-datetime2-norsk"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-norsk"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48267"

RPM_NAME = "texlive-datetime2-norsk-doc-2023.209.1.1svn48267-53.1.noarch.rpm"
RPM_HASH = "af68492cd7acfc8bd2bd19f000a645e3e12e60ebce3c4a0bef9afc04c66b3aeddc1abf6c7b18a0e5defa557b6842fa60b8f93113fb403d79cee481778f7ed922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-norsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
