SUMMARY = "Documentation for texlive-twoinone"
DESCRIPTION = "This package includes the documentation for texlive-twoinone"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17024"

RPM_NAME = "texlive-twoinone-doc-2023.201.svn17024-52.1.noarch.rpm"
RPM_HASH = "d334a0bf3e7dbe9bece89ac972103c9f1a9fd0cc0729d8156874bd2879bd8ceec12e0dfad7c8565f0a5d8cb00a864e91c2cfebbe10f030e2fbe1945267901c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoinone-doc"
RDEPENDS:${PN} += ""

inherit rpm
