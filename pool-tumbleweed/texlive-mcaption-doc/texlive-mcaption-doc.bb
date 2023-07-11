SUMMARY = "Documentation for texlive-mcaption"
DESCRIPTION = "This package includes the documentation for texlive-mcaption"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.0svn15878"

RPM_NAME = "texlive-mcaption-doc-2023.208.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "f2a8027e9d455811039ebb22a47b5d63f94154d5630a05d35b4939fe25dfd0b7eeb238d496db2b91276c424f8056668ee1025236e2cb91a8ae7f2b3418982038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcaption-doc"

RDEPENDS:${PN} += ""

inherit rpm
