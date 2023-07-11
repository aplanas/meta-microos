SUMMARY = "Documentation for texlive-xint"
DESCRIPTION = "This package includes the documentation for texlive-xint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4msvn63562"

RPM_NAME = "texlive-xint-doc-2023.201.1.4msvn63562-52.2.noarch.rpm"
RPM_HASH = "7f9494dc29ea64545b207654d92a4f5b8bf85b638a561fc840c934ef31b266842a2232ed5437b6d8268b114eb5ffecc3c523115fb0787d80e01558285574621f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xint-doc"

RDEPENDS:${PN} += ""

inherit rpm
