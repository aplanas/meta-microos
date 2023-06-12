SUMMARY = "Documentation for texlive-hyphenat"
DESCRIPTION = "This package includes the documentation for texlive-hyphenat"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3csvn15878"

RPM_NAME = "texlive-hyphenat-doc-2023.201.2.3csvn15878-52.1.noarch.rpm"
RPM_HASH = "3e1466fd2104130eb855bdc31169fc930349082a40fbc8ba228a25a6e0d3d68edeab8c0c9ea8963269c4c00c593fad948dc686f7193a70bafd38b0931400155f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphenat-doc"
RDEPENDS:${PN} += ""

inherit rpm
