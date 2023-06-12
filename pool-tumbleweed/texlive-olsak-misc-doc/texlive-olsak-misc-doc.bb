SUMMARY = "Documentation for texlive-olsak-misc"
DESCRIPTION = "This package includes the documentation for texlive-olsak-misc"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.aug._2022svn65631"

RPM_NAME = "texlive-olsak-misc-doc-2023.201.aug._2022svn65631-54.1.noarch.rpm"
RPM_HASH = "fae5bb39404cea0f1ed0ca17a818c914bbefb42b8aa76f642ca36d459d879ad0a69b42b25b7b1e737443db66bec6530940995af8595b34cf4f0b563f1fa103f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-olsak-misc-doc"
RDEPENDS:${PN} += ""

inherit rpm
