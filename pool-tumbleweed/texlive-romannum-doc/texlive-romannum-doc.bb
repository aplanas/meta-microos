SUMMARY = "Documentation for texlive-romannum"
DESCRIPTION = "This package includes the documentation for texlive-romannum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0bsvn15878"

RPM_NAME = "texlive-romannum-doc-2023.209.1.0bsvn15878-54.1.noarch.rpm"
RPM_HASH = "0ceca89594974e7894cece73d9aec848f60063868f81bc114a35dcae1a4de9130295da2288f19a27805e98236224cfc01c1b995947a7bea921193d1050f13bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romannum-doc"

RDEPENDS:${PN} += ""

inherit rpm
