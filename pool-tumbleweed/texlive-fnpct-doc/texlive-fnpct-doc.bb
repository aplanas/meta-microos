SUMMARY = "Documentation for texlive-fnpct"
DESCRIPTION = "This package includes the documentation for texlive-fnpct"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn62248"

RPM_NAME = "texlive-fnpct-doc-2023.209.1.1asvn62248-53.1.noarch.rpm"
RPM_HASH = "ce7ecfd7bc03fdefaa6d4d6e9f5d631ad5fcd6917032876d91570536952acec62f1ea92fde63daaca4e0c3ce01a4885ed3ce04788808a0f09273b45e5654a313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnpct-doc"

RDEPENDS:${PN} += ""

inherit rpm
