SUMMARY = "Documentation for texlive-relenc"
DESCRIPTION = "This package includes the documentation for texlive-relenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22050"

RPM_NAME = "texlive-relenc-doc-2023.201.svn22050-53.1.noarch.rpm"
RPM_HASH = "d2e55ab4d26a3bfae1a09fc8f11c5e3d2de495eaf81cb9611c3e880eb726aba0ada753761f181bcea44446236218ee2d37c3a954387adc98f2c58b335150bcfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
