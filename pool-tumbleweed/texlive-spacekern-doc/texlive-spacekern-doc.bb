SUMMARY = "Documentation for texlive-spacekern"
DESCRIPTION = "This package includes the documentation for texlive-spacekern"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn63552"

RPM_NAME = "texlive-spacekern-doc-2023.209.0.0.1asvn63552-58.1.noarch.rpm"
RPM_HASH = "becf20dbece01f16adde697ee3cf0858adfdeb325784ef4cbc0447294728d8ee3f5fa4448b04508bea9a69b67077e4fc6db9ebbc54da30c4916bbe99acf4337b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spacekern-doc"

RDEPENDS:${PN} += ""

inherit rpm
