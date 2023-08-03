SUMMARY = "Documentation for texlive-enotez"
DESCRIPTION = "This package includes the documentation for texlive-enotez"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-doc-2023.209.0.0.10dsvn61490-54.1.noarch.rpm"
RPM_HASH = "77d8435021381a7aae43d954ccfebbb736ef24af2686b13424058ab8d4028e39e6354a46631842339b001079d0fd983ac27bf6a75d7c81de80e4913a0abd9a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
