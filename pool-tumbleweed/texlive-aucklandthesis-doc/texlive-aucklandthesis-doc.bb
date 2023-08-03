SUMMARY = "Documentation for texlive-aucklandthesis"
DESCRIPTION = "This package includes the documentation for texlive-aucklandthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51323"

RPM_NAME = "texlive-aucklandthesis-doc-2023.209.svn51323-54.1.noarch.rpm"
RPM_HASH = "fd5a29f8842f11eec219df9031f9ff0a8bfdc5366531482ba155029c067a80fb7c54b5568be1074087f4ecc063f2326642bddcd3f3518b4753af529f59d14af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aucklandthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
