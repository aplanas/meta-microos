SUMMARY = "Documentation for texlive-gfsneohellenicmath"
DESCRIPTION = "This package includes the documentation for texlive-gfsneohellenicmath"
LICENSE = "OFL-1.1"

PV = "2023.209.1.02svn63928"

RPM_NAME = "texlive-gfsneohellenicmath-doc-2023.209.1.02svn63928-53.1.noarch.rpm"
RPM_HASH = "d7b463a7c0740f9f27be2d9952b34f49ebeb4bcfa5befe61ea20280f447aec987c02ec98e3ce342e4ecb092b4d0a34c6161cb26cb456fae61b5c084de7fe675b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsneohellenicmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
