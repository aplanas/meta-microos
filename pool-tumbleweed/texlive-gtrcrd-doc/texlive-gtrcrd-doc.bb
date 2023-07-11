SUMMARY = "Documentation for texlive-gtrcrd"
DESCRIPTION = "This package includes the documentation for texlive-gtrcrd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-doc-2023.201.1.1svn32484-53.2.noarch.rpm"
RPM_HASH = "3fd47e7e9b12db1eb1ead20acd41d006d8bfd42c4963e31c124b12c3f3c04c85a0840ad9f148833b6ad9b624ce19a9a0d7979e8d067f271e162fc16aedf13aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrcrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
