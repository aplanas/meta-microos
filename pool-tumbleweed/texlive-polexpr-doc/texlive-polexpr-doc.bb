SUMMARY = "Documentation for texlive-polexpr"
DESCRIPTION = "This package includes the documentation for texlive-polexpr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.7asvn63337"

RPM_NAME = "texlive-polexpr-doc-2023.201.0.0.8.7asvn63337-52.1.noarch.rpm"
RPM_HASH = "bed375196d0901da083f10666c7c2b6ad03b0943980c9fe20798bd25330be69e253fa180e337ff54ac3691e90d4528a3bcfc77e239c65c3c6ccb125668206d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm
