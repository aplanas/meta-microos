SUMMARY = "Documentation for texlive-librecaslon"
DESCRIPTION = "This package includes the documentation for texlive-librecaslon"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64432"

RPM_NAME = "texlive-librecaslon-doc-2023.209.svn64432-55.1.noarch.rpm"
RPM_HASH = "8894382ef5b8c0cd052ef72a8797159ae998e66b76d1889e597c8dba11c6810eb3f8fdcd2c0bea97afbe50a058e8dce709da4abe1045ec60d9d2798352e6a42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librecaslon-doc"

RDEPENDS:${PN} += ""

inherit rpm
