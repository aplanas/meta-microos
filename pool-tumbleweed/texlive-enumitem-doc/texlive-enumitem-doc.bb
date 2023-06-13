SUMMARY = "Documentation for texlive-enumitem"
DESCRIPTION = "This package includes the documentation for texlive-enumitem"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9svn51423"

RPM_NAME = "texlive-enumitem-doc-2023.201.3.9svn51423-53.1.noarch.rpm"
RPM_HASH = "c286e8ff31f9482676576acfe9ddedf300179f59e23d880504e18e2304f2a5168587b7a57687ae6a08b76fc81a2ce1e84beef6103a09b083060da54ab36a0077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
