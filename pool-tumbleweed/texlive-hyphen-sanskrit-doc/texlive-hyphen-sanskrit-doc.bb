SUMMARY = "Documentation for texlive-hyphen-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-sanskrit-doc-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "7bb29e0ed5f615b77a7096c06182b43e5fca0bd8df3a175d01e998a410dcb5b5e59d7c6df4fb9ae83310a76656d2e8a690cf855c828dc2b2d6124738bc28df32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-sanskrit-doc"

RDEPENDS:${PN} += ""

inherit rpm
