SUMMARY = "Documentation for texlive-fnspe"
DESCRIPTION = "This package includes the documentation for texlive-fnspe"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn45360"

RPM_NAME = "texlive-fnspe-doc-2023.201.1.2asvn45360-52.1.noarch.rpm"
RPM_HASH = "876d7fd01a2ace1cdfc90fe8a39084e1125196574f15a2f567665085fab7e2750a15912fcd9d5049c6c9a465cf1308f17eb303875f7ca3a2cf8fc01aace0282b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnspe-doc"

RDEPENDS:${PN} += ""

inherit rpm
