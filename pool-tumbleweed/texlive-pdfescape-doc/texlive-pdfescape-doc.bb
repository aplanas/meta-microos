SUMMARY = "Documentation for texlive-pdfescape"
DESCRIPTION = "This package includes the documentation for texlive-pdfescape"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn53082"

RPM_NAME = "texlive-pdfescape-doc-2023.201.1.15svn53082-51.1.noarch.rpm"
RPM_HASH = "5a27caada98a48d4b6685a7c3f6515a223b6b4fd1de0169f488e4ad71a36427180976eba75978bc909cf3a9996a349ff34d9d30dbb99315d449ed513bc99e0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfescape-doc"

RDEPENDS:${PN} += ""

inherit rpm
