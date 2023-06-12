SUMMARY = "Documentation for texlive-breqn"
DESCRIPTION = "This package includes the documentation for texlive-breqn"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98lsvn60881"

RPM_NAME = "texlive-breqn-doc-2023.201.0.0.98lsvn60881-52.1.noarch.rpm"
RPM_HASH = "873bea9fd7573f03d84288521803630a199f239bb0b206721c50f3c79f9a1b56b80a5337f32a2452b68e207c86d5ac7b46ba31cd87d1cb00cfd8ff264ce19b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breqn-doc"
RDEPENDS:${PN} += ""

inherit rpm
