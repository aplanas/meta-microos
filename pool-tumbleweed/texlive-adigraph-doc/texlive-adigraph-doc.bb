SUMMARY = "Documentation for texlive-adigraph"
DESCRIPTION = "This package includes the documentation for texlive-adigraph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7.1svn49862"

RPM_NAME = "texlive-adigraph-doc-2023.209.1.7.1svn49862-55.1.noarch.rpm"
RPM_HASH = "60f4d960637aff0020af48d81fbf93f0ac3181f1857f1542321bcf60d57cbbe729484921af2799db5de0b42458ad786167624243de95ac9fe179c4a2e90c7c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
