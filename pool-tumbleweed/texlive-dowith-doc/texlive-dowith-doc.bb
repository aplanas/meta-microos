SUMMARY = "Documentation for texlive-dowith"
DESCRIPTION = "This package includes the documentation for texlive-dowith"
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.32svn38860"

RPM_NAME = "texlive-dowith-doc-2023.201.r0.32svn38860-52.1.noarch.rpm"
RPM_HASH = "4446982d233089aa2b687145d4b17abf080b4714d4ed6a7e04babfe862cccc54ccb682e6953492ae9ff4ecd9058984f70dd89c2d7fc95ecd4d22ec1258751807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dowith-doc"

RDEPENDS:${PN} += ""

inherit rpm
