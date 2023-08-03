SUMMARY = "Documentation for texlive-glossaries-slovene"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-slovene"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-doc-2023.209.1.0svn51211-54.1.noarch.rpm"
RPM_HASH = "33db9d4373977af11d39ee8a6751f6d3e3de4362f174a7d2d6d5e3ae19059162d346c6e2650ffa94bbe949a84b6ead9612cc2150236c95831b70cbb9b059b426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
