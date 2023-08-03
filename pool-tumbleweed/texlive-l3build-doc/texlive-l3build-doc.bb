SUMMARY = "Documentation for texlive-l3build"
DESCRIPTION = "This package includes the documentation for texlive-l3build"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66471"

RPM_NAME = "texlive-l3build-doc-2023.209.svn66471-56.1.noarch.rpm"
RPM_HASH = "aabe6da5eb5ca0dd2b519a7c259aeacbf42b9ee527ecc8feeeeaa2be65d975b4f1f8bb6cc03b11b20c2002f99e229c254f5f0373abaae16d9eb3bdf500f99c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-l3build.1 \
texlive-l3build-doc"

RDEPENDS:${PN} += ""

inherit rpm
