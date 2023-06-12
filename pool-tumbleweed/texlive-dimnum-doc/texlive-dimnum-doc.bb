SUMMARY = "Documentation for texlive-dimnum"
DESCRIPTION = "This package includes the documentation for texlive-dimnum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn58774"

RPM_NAME = "texlive-dimnum-doc-2023.201.1.0.1svn58774-52.1.noarch.rpm"
RPM_HASH = "54a6d08b354b8313a7d1c2b8ddb79319ec98c71e4ee1d79ae22c116218b096356aeb4aae57c379af0b1d207162f3038be11c360dd4d7ce2bc46dedf6725d5fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dimnum-doc"
RDEPENDS:${PN} += ""

inherit rpm
