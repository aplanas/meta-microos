SUMMARY = "Documentation for texlive-tikzsymbols"
DESCRIPTION = "This package includes the documentation for texlive-tikzsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.12asvn61300"

RPM_NAME = "texlive-tikzsymbols-doc-2023.209.4.12asvn61300-53.1.noarch.rpm"
RPM_HASH = "4ecdbf402fe239f74efe347dee43be8348ab42dc75c2525a72e04d32de4953044d013a7610a50303e69dc67cc7c078c0a2094ba5b9ed3994c61517643cd0cd92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
