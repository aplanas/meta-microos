SUMMARY = "Documentation for texlive-oinuit"
DESCRIPTION = "This package includes the documentation for texlive-oinuit"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28668"

RPM_NAME = "texlive-oinuit-doc-2023.201.svn28668-54.1.noarch.rpm"
RPM_HASH = "8b54219f7c0200888133358b25a03b60f32c4c8125d9d72b2d1c16e67bf9b8e06449cb2e73e2f565f4419f5ffa845c07d0cb325084c4576a46ac4fad27b88cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oinuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
