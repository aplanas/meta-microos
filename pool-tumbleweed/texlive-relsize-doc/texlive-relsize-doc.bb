SUMMARY = "Documentation for texlive-relsize"
DESCRIPTION = "This package includes the documentation for texlive-relsize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.1svn30707"

RPM_NAME = "texlive-relsize-doc-2023.209.4.1svn30707-54.1.noarch.rpm"
RPM_HASH = "ffe79535b1bc8012c2df8df739c2069288bc261dbf7685891ae0e70868a9d8fb7b9381b8158d4ff1f79b4e70da7de7f6a25ddf3162df7e549ba78bf5fe3a8cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
