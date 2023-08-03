SUMMARY = "Documentation for texlive-listlbls"
DESCRIPTION = "This package includes the documentation for texlive-listlbls"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn34893"

RPM_NAME = "texlive-listlbls-doc-2023.209.1.03svn34893-55.1.noarch.rpm"
RPM_HASH = "b060b86494eee60de5001f2e7daa97b90967e146be0480832eeda1378c489b9639d64d480c096ad3c0eec12eb165205c11661c00ed2e2c1aa3d317c36df0e46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listlbls-doc"

RDEPENDS:${PN} += ""

inherit rpm
