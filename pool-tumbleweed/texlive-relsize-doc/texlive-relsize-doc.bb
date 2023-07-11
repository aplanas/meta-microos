SUMMARY = "Documentation for texlive-relsize"
DESCRIPTION = "This package includes the documentation for texlive-relsize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.1svn30707"

RPM_NAME = "texlive-relsize-doc-2023.201.4.1svn30707-53.2.noarch.rpm"
RPM_HASH = "8196b0faf4e4c6bc9fcb0cd59b00b9c20d5869c4cda4faa1bf2377b326e5fc7c82eb0ad47ff100bb94764c37e2d5753ad415ab1781faa34230198697be6433b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
