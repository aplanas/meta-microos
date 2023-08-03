SUMMARY = "Documentation for texlive-beton"
DESCRIPTION = "This package includes the documentation for texlive-beton"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-beton-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e86c87c807a90cfbe5763fcdd52f0bb7b56c8c6ee80a4e34b41fa1b68370d01a159e269203465e18b97b641018ff61d8e41ac5db319696e322b5356e5a95f243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beton-doc"

RDEPENDS:${PN} += ""

inherit rpm
