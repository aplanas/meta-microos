SUMMARY = "Documentation for texlive-ragged2e"
DESCRIPTION = "This package includes the documentation for texlive-ragged2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn66152"

RPM_NAME = "texlive-ragged2e-doc-2023.209.3.4svn66152-54.2.noarch.rpm"
RPM_HASH = "98b75fa4f8965bea4a37e8b3b471f0d69ed064c80235a3969a20d1f82c4d79e8a18019a14fab1b7bb0fb8788d707ab2b89740219e3d888e1c9eaa9b17931ac75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ragged2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
