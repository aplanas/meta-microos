SUMMARY = "Documentation for texlive-altsubsup"
DESCRIPTION = "This package includes the documentation for texlive-altsubsup"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62738"

RPM_NAME = "texlive-altsubsup-doc-2023.209.1.1svn62738-55.1.noarch.rpm"
RPM_HASH = "85a0c612c556d7b333721f040e5c40c34189f16ab3f5e0ac11502dbf5265e94b90c1840f89cf2c1a6ee826b5f7a0c69cde29384bc9092b5a155198022787d315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-altsubsup-doc"

RDEPENDS:${PN} += ""

inherit rpm
