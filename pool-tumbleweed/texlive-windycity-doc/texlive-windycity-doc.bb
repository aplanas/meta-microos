SUMMARY = "Documentation for texlive-windycity"
DESCRIPTION = "This package includes the documentation for texlive-windycity"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61223"

RPM_NAME = "texlive-windycity-doc-2023.209.svn61223-54.1.noarch.rpm"
RPM_HASH = "9c46dbb79a811c51812497d3c74b015780d3ea7cb3923864e4bdca35ab3ca0939dad9e30b210f3335230cd2af1bb091ef4cdf4b66ffe23d31359499a1fdd84a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-windycity-doc"

RDEPENDS:${PN} += ""

inherit rpm
