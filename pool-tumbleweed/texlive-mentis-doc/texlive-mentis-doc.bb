SUMMARY = "Documentation for texlive-mentis"
DESCRIPTION = "This package includes the documentation for texlive-mentis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-mentis-doc-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "aea9259524a3a86b6aebe192a2d6f8ace080f3f0c224a3ced1e8e52e9e08fb3c4e7286786f019eeda2258d668684b0f43c4ca7dfa4c150e887b4dc8481b7e4a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mentis-doc"

RDEPENDS:${PN} += ""

inherit rpm
