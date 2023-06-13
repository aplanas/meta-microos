SUMMARY = "Documentation for texlive-rcs-multi"
DESCRIPTION = "This package includes the documentation for texlive-rcs-multi"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-doc-2023.201.0.0.1asvn64967-53.1.noarch.rpm"
RPM_HASH = "add85cf02fc9a396b5db66725f4293889620f12e58ded51cdeb46f6d9f83c7b65b1e960a8231a1527e0a6dd0d734657050f5c443f86d62a3013b78d267911259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
