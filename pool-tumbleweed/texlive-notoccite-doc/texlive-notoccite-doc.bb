SUMMARY = "Documentation for texlive-notoccite"
DESCRIPTION = "This package includes the documentation for texlive-notoccite"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn18129"

RPM_NAME = "texlive-notoccite-doc-2023.209.svn18129-55.1.noarch.rpm"
RPM_HASH = "491977342a50e6ee976e828db07bfbe25e1de02b0fcb345071fa41d49a1ab6b7b9e32f1195836b4967866eac390a46733a2738cf4642c632ff02b1d6533518a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notoccite-doc"

RDEPENDS:${PN} += ""

inherit rpm
