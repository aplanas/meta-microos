SUMMARY = "Documentation for texlive-linguisticspro"
DESCRIPTION = "This package includes the documentation for texlive-linguisticspro"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64858"

RPM_NAME = "texlive-linguisticspro-doc-2023.201.svn64858-54.1.noarch.rpm"
RPM_HASH = "0f96de7a91534f855e34563ed4864a75df05d2abdb0b53f6bfba52d3ee6c7e627f4e1ca751edde298ab175c624c3363416798db00418a091cd81ecc31168e8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguisticspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
