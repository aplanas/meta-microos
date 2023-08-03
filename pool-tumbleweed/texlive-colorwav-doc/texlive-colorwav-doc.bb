SUMMARY = "Documentation for texlive-colorwav"
DESCRIPTION = "This package includes the documentation for texlive-colorwav"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-colorwav-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "9834f716cf4f1e4b3927926c43ec7ff39cbbd366180398a025a2a1343d567459e4212a4117d7b33d3022c823bb5a7dc104401c77aa6f945b15ee2d0281e59d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorwav-doc"

RDEPENDS:${PN} += ""

inherit rpm
