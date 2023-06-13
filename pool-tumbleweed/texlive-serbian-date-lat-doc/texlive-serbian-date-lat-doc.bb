SUMMARY = "Documentation for texlive-serbian-date-lat"
DESCRIPTION = "This package includes the documentation for texlive-serbian-date-lat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn23446"

RPM_NAME = "texlive-serbian-date-lat-doc-2023.201.svn23446-53.1.noarch.rpm"
RPM_HASH = "c8a2b1bdc4066a22f2752db9429fffc7ebee50d083f42ee001ef89ac4f75f60225079fa2942e0844884418ebfb7e19dee17becd2c182cf754ea2d97c7456ade1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-date-lat-doc"

RDEPENDS:${PN} += ""

inherit rpm
