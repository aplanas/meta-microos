SUMMARY = "Documentation for texlive-tikzsymbols"
DESCRIPTION = "This package includes the documentation for texlive-tikzsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.12asvn61300"

RPM_NAME = "texlive-tikzsymbols-doc-2023.201.4.12asvn61300-52.1.noarch.rpm"
RPM_HASH = "06a10806c2a9769ebf2034e6ffadccfde5b4ca6426302eb4397b44fe4ce7d843579bcfdc9b3935a3ac9163c4ea188245fa3ce9be25bfa4cf45be741f59794204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzsymbols-doc"
RDEPENDS:${PN} += ""

inherit rpm
