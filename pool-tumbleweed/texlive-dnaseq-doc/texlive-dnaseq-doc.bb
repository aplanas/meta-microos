SUMMARY = "Documentation for texlive-dnaseq"
DESCRIPTION = "This package includes the documentation for texlive-dnaseq"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn17194"

RPM_NAME = "texlive-dnaseq-doc-2023.201.0.0.01svn17194-52.1.noarch.rpm"
RPM_HASH = "ae3bf437337804a6cbb9b5359e71e6db3dd8258df0349aa27c14ec8a78f178d4225aab3936b54721475ed78c1baad0ce96c0fdd78ece1ed5c7038bcb445d729a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dnaseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
