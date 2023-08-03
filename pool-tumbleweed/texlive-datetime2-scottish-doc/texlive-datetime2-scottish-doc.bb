SUMMARY = "Documentation for texlive-datetime2-scottish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-scottish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52101"

RPM_NAME = "texlive-datetime2-scottish-doc-2023.209.1.1svn52101-53.1.noarch.rpm"
RPM_HASH = "f5a31c10dfe96e9e3daad66d6fbc4f30992a78ec056ba47277d21208b5f8e4b8442fb291f620a1800319399b2865cfcca3590e2faf95f5a452c79916de78b4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-scottish-doc"

RDEPENDS:${PN} += ""

inherit rpm
