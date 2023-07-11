SUMMARY = "Documentation for texlive-glossaries-serbian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "84f1d150cdf0fc3d81a73cf7dc5322ad0b519d8b0b8a2a5e39ebb2958593cd885cf19bd84943993c8ad97c1b54ec9e94b72bbefc9c1ec0bba1b581b9dc6822ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
