SUMMARY = "Documentation for texlive-biblatex-fiwi"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-fiwi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn45876"

RPM_NAME = "texlive-biblatex-fiwi-doc-2023.209.1.7svn45876-54.1.noarch.rpm"
RPM_HASH = "950ec3ccbe21637f3ec77fb513456ea04f530343dac9a7abd2c44437d35a9f61947aac14164e88ad6fe96cb8ce1b814f7b287a1826fb10f696e1142279372fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-fiwi-doc-de \
texlive-biblatex-fiwi-doc"

RDEPENDS:${PN} += ""

inherit rpm
