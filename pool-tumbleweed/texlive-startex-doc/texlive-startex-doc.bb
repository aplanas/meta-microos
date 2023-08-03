SUMMARY = "Documentation for texlive-startex"
DESCRIPTION = "This package includes the documentation for texlive-startex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.04svn35718"

RPM_NAME = "texlive-startex-doc-2023.209.1.04svn35718-58.1.noarch.rpm"
RPM_HASH = "b6ac58142b8ec7ab59087e3d83d64b576b366b6ec02c4419f73d391e17d905d711a4e8a5cc00c6817ff8cc14fa232c6afaf4d32a68b9597b343368f228cb4baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-startex-doc"

RDEPENDS:${PN} += ""

inherit rpm
