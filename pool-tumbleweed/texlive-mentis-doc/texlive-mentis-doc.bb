SUMMARY = "Documentation for texlive-mentis"
DESCRIPTION = "This package includes the documentation for texlive-mentis"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5svn15878"

RPM_NAME = "texlive-mentis-doc-2023.208.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "7b79cf425a4e90e20a20900e91de6e413e7c3178cd776d40d49fbc5e6945ee3c47e71dfeb891f026a4514e3a2087539d49ea204bf4eead4e47427f15ddc6e034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mentis-doc"

RDEPENDS:${PN} += ""

inherit rpm
