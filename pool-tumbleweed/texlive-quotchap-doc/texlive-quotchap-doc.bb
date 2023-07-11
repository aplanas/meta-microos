SUMMARY = "Documentation for texlive-quotchap"
DESCRIPTION = "This package includes the documentation for texlive-quotchap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn56926"

RPM_NAME = "texlive-quotchap-doc-2023.201.1.3svn56926-53.2.noarch.rpm"
RPM_HASH = "f6f40f6c49ed838afac749f3e678eefecb73090b0b084714f9ac2d5b7b453dfeffb03d8c2971f75d7c1481075e83cb85e4ec7cc609fff52d0b8963fb84ac046a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
