SUMMARY = "Documentation for texlive-hyphenat"
DESCRIPTION = "This package includes the documentation for texlive-hyphenat"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3csvn15878"

RPM_NAME = "texlive-hyphenat-doc-2023.209.2.3csvn15878-54.1.noarch.rpm"
RPM_HASH = "6f61eec266335c6b2edea61f0eba297e0c9480485f6a6d09964bd94cef2cb201a32adf7856d56439390c8b6e69f6e7f826521415a8d98fd2b8c2bccc4009f389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphenat-doc"

RDEPENDS:${PN} += ""

inherit rpm
