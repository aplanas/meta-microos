SUMMARY = "Documentation for texlive-mercatormap"
DESCRIPTION = "This package includes the documentation for texlive-mercatormap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn56060"

RPM_NAME = "texlive-mercatormap-doc-2023.209.1.02svn56060-55.1.noarch.rpm"
RPM_HASH = "b32bc661674d8c7f44649983ad306a68977db7910586899bcf9769731c66a4a8d0ebf22e959828dbbf6fb43b3f9440349e471dbffc8b8a9cd9b79e56852ef89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mercatormap-doc"

RDEPENDS:${PN} += ""

inherit rpm
