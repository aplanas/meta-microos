SUMMARY = "Documentation for texlive-beamertheme-phnompenh"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-phnompenh"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn39100"

RPM_NAME = "texlive-beamertheme-phnompenh-doc-2023.209.1.0svn39100-54.1.noarch.rpm"
RPM_HASH = "bf681fe305313b151a98e692c095589b20d8ab59f7511517106cfcc3d7e2f80f45be0cbb35eaa51842b2f8b8c99098351ba2dd80ce9421d3858b0d492c1d86bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-phnompenh-doc"

RDEPENDS:${PN} += ""

inherit rpm
