SUMMARY = "Documentation for texlive-academicons"
DESCRIPTION = "This package includes the documentation for texlive-academicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.1_2svn62622"

RPM_NAME = "texlive-academicons-doc-2023.201.1.9.1_2svn62622-54.1.noarch.rpm"
RPM_HASH = "5bbe6ae23c1c0d32e4110ef6256f6bff72ffde960d048396a209ec7a334830401d530cafa88e30e36374a67f904e78bcb00191284086e7ee3a33912c673897cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-academicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
