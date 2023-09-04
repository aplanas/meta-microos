SUMMARY = "Documentation for texlive-elmath"
DESCRIPTION = "This package includes the documentation for texlive-elmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-elmath-doc-2023.209.1.2svn15878-54.2.noarch.rpm"
RPM_HASH = "ae9861a66942464469d842dd7de7ca2de07abb605efee7b6b3cc8d033c0b56d209bd3d8361f4a065a346919f61db328b1c60f6559704cb2f75f1bc2d2d44ce05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
