SUMMARY = "Documentation for texlive-fira"
DESCRIPTION = "This package includes the documentation for texlive-fira"
LICENSE = "OFL-1.1"

PV = "2023.209.4.3svn64422"

RPM_NAME = "texlive-fira-doc-2023.209.4.3svn64422-53.1.noarch.rpm"
RPM_HASH = "af182174f139e8502b8c6e16268e755329c060195ebece603736419ac54f0598b52de0678cbfc6a21a869084a2bee7726450febaa960f1f0c7bc5d838088f1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fira-doc"

RDEPENDS:${PN} += ""

inherit rpm
