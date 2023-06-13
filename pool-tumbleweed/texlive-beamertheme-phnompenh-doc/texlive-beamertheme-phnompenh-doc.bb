SUMMARY = "Documentation for texlive-beamertheme-phnompenh"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-phnompenh"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn39100"

RPM_NAME = "texlive-beamertheme-phnompenh-doc-2023.201.1.0svn39100-53.1.noarch.rpm"
RPM_HASH = "4a848a80b41d3cc81e344ffa546331fc16a572e935c9499b29f02a1bc7d6a8df7bc2bdce20ad015dcfbc05e261f3d63bf504b57a981849e865765ce3a42ae9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-phnompenh-doc"

RDEPENDS:${PN} += ""

inherit rpm
