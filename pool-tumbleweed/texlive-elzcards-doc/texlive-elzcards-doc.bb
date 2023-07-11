SUMMARY = "Documentation for texlive-elzcards"
DESCRIPTION = "This package includes the documentation for texlive-elzcards"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.60svn51894"

RPM_NAME = "texlive-elzcards-doc-2023.201.1.60svn51894-53.2.noarch.rpm"
RPM_HASH = "1d7f950a86b329a4b9c388fbf1c71f9eeee12b8bba109f05647d814efb34b545502df5c4d36f788ce9d876a7fc90fa07df22e213b1ec66215c61590e13571a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elzcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
