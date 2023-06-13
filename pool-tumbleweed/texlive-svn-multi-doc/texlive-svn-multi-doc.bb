SUMMARY = "Documentation for texlive-svn-multi"
DESCRIPTION = "This package includes the documentation for texlive-svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4dsvn64967"

RPM_NAME = "texlive-svn-multi-doc-2023.201.2.4dsvn64967-57.1.noarch.rpm"
RPM_HASH = "a7fc041e5be3d16ea9c532cf5342adba9f402cec57e367ab5190b864bf7737c6975f4cee74f61b87ba881635f14d51a99d8ab3112390e0461cd32abfd0b079ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
