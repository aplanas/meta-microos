SUMMARY = "Documentation for texlive-glossaries-irish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-irish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "4d8dbcb259e180e6a4e37169047ec6ab5040f25d8d8fcc4e86fee6ada1d67a9e15cc66642df275029caf3275a531b4d315572224229c013cf9e95e2f347db5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
