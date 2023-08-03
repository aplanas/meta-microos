SUMMARY = "Documentation for texlive-scrlttr2copy"
DESCRIPTION = "This package includes the documentation for texlive-scrlttr2copy"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn56733"

RPM_NAME = "texlive-scrlttr2copy-doc-2023.209.0.0.3asvn56733-54.1.noarch.rpm"
RPM_HASH = "950cbb11299476dfc04e9e7ccdea844553d4cdeb7b75d38acdee4f4e9f83b6fbf83275fea1e2ad283dc4a095100895595249ac4388f69a8225aac9b7f784c96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlttr2copy-doc"

RDEPENDS:${PN} += ""

inherit rpm
