SUMMARY = "Documentation for texlive-hf-tikz"
DESCRIPTION = "This package includes the documentation for texlive-hf-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-doc-2023.201.0.0.3asvn34733-53.2.noarch.rpm"
RPM_HASH = "4fc44823b52c87f43812fadf51cbb64c2db9e33dae7f05422cf66667ce45d429679551c066355f29954ffacd51a0cb4b3d0a927c254dba6afa12c0904e5b2e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hf-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
