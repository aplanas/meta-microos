SUMMARY = "Documentation for texlive-gitfile-info"
DESCRIPTION = "This package includes the documentation for texlive-gitfile-info"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-doc-2023.201.0.0.5svn51928-53.2.noarch.rpm"
RPM_HASH = "02e2b57fa7a7b197ef97c673eda9d936f3e86ef3b277c4c0c6cc3e06933e39bd29f472c0f82776cf09ef137ee6e4f54eae8cf20b1805a47a624c673d7dd7379a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitfile-info-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
