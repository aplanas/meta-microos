SUMMARY = "Documentation for texlive-din1505"
DESCRIPTION = "This package includes the documentation for texlive-din1505"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19441"

RPM_NAME = "texlive-din1505-doc-2023.201.svn19441-52.1.noarch.rpm"
RPM_HASH = "d623828cb9579d377d98c642fc432303079beb671f6eba58f91b34e0e1a479b99e1cd75f764adc9976feca2fdbdaab191eae4845cd06536246897cb7ae2f17ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-din1505-doc"

RDEPENDS:${PN} += ""

inherit rpm
