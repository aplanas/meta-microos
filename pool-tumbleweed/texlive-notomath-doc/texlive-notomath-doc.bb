SUMMARY = "Documentation for texlive-notomath"
DESCRIPTION = "This package includes the documentation for texlive-notomath"
LICENSE = "OFL-1.1"

PV = "2023.209.1.02svn58726"

RPM_NAME = "texlive-notomath-doc-2023.209.1.02svn58726-55.1.noarch.rpm"
RPM_HASH = "df33adb1f4731d44fc1343fa5702a820ac5e4a9d029df97f79cf873a83b73f089cd81e8d79888475985aaf09d99239f6e19ffce7edc09938024336cbdf092f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
