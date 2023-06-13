SUMMARY = "Documentation for texlive-kerntest"
DESCRIPTION = "This package includes the documentation for texlive-kerntest"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.32svn15878"

RPM_NAME = "texlive-kerntest-doc-2023.201.1.32svn15878-55.1.noarch.rpm"
RPM_HASH = "5f6355f1fc30ece0a0e19ceaf94c5003febe97328bec821da68b54c0b41e8d7987e282cc5210f38b8652466137e154e7d8f1d0f56ad74f0043e78d0c6d1e19b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kerntest-doc"

RDEPENDS:${PN} += ""

inherit rpm
