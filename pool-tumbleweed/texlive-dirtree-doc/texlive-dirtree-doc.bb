SUMMARY = "Documentation for texlive-dirtree"
DESCRIPTION = "This package includes the documentation for texlive-dirtree"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.32svn42428"

RPM_NAME = "texlive-dirtree-doc-2023.209.0.0.32svn42428-53.1.noarch.rpm"
RPM_HASH = "24d879c3faa2ce24277d3f3da1fe1374f32a2309e244db66fa7972ad6e4d60897c5c77d13bec7174cf0a7415a8f3eae36ce80e4bad05941b645c0e292cdc1026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dirtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
