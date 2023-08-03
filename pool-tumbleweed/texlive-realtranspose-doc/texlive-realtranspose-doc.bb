SUMMARY = "Documentation for texlive-realtranspose"
DESCRIPTION = "This package includes the documentation for texlive-realtranspose"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56623"

RPM_NAME = "texlive-realtranspose-doc-2023.209.1.1svn56623-54.1.noarch.rpm"
RPM_HASH = "a368f22c51637fc38402e471ffb403b772972aa57140f775d2e3b922243e32edf203fe2ab91eb6d9f2e547fc33d063ea1199918210b73358e0c9dc5b24887dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realtranspose-doc"

RDEPENDS:${PN} += ""

inherit rpm
