SUMMARY = "Documentation for texlive-latexpand"
DESCRIPTION = "This package includes the documentation for texlive-latexpand"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.7.2svn66226"

RPM_NAME = "texlive-latexpand-doc-2023.201.1.7.2svn66226-54.1.noarch.rpm"
RPM_HASH = "ea587b5d1643b5ec124b2673fee983ca014498ed66f495de7dce8bbdc503d630d4fccfaecceae9502787305d0e380b042600040511d15a66572b3449222b33b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexpand-doc"

RDEPENDS:${PN} += ""

inherit rpm
