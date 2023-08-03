SUMMARY = "Documentation for texlive-gcard"
DESCRIPTION = "This package includes the documentation for texlive-gcard"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gcard-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "019e412fbcaf8e91b60cd726659cd5e6c8568c8ecc3afbd0a3f08b42e6d0cad195fb7e83eeffd4b231ad9b75231116f80356fde18fec038453dac1276ad2d231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
