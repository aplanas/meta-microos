SUMMARY = "Documentation for texlive-authorindex"
DESCRIPTION = "This package includes the documentation for texlive-authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51757"

RPM_NAME = "texlive-authorindex-doc-2023.209.svn51757-54.1.noarch.rpm"
RPM_HASH = "74021306540d895032703900efa8a79e3714fc0145b58982c12c7399b703db196d96b4cb1e35c65f379e32d1d9776f07e3c09f56c1c96ed58e690a6b7c7a3f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authorindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
