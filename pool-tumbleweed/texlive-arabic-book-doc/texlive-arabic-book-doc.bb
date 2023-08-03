SUMMARY = "Documentation for texlive-arabic-book"
DESCRIPTION = "This package includes the documentation for texlive-arabic-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59594"

RPM_NAME = "texlive-arabic-book-doc-2023.209.1.0svn59594-55.1.noarch.rpm"
RPM_HASH = "eb66e70002c44b8fff41f02e996208937d414ef73d2cdd02e3d7d488dc62ea0671e757ba0356ea820235d6771f859f5a8a6f71ffa6238b99bdbec46881b9c834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabic-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
