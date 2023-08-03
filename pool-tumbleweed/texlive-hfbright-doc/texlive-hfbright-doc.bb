SUMMARY = "Documentation for texlive-hfbright"
DESCRIPTION = "This package includes the documentation for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-hfbright-doc-2023.209.svn29349-54.1.noarch.rpm"
RPM_HASH = "62f0b065b4adc98932bc2816343ffd6d564979c3c1092d20e2a7e70a4c80dfcfc41957c753c24350b9961952af3000edff06b3ad2554cc39a847cfe64bb89cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfbright-doc"

RDEPENDS:${PN} += ""

inherit rpm
