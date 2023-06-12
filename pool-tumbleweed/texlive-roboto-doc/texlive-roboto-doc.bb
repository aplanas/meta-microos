SUMMARY = "Documentation for texlive-roboto"
DESCRIPTION = "This package includes the documentation for texlive-roboto"
LICENSE = "Apache-1.0"

PV = "2023.201.svn64350"

RPM_NAME = "texlive-roboto-doc-2023.201.svn64350-53.1.noarch.rpm"
RPM_HASH = "c341ffe011e6d23a89ee313205d1b41111d9d0a598c4433d20a354361516babf5d17ddfafb7055bd673c6d27d5a5be238ffe3ea36389f13408f434cae6fe0e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roboto-doc"
RDEPENDS:${PN} += ""

inherit rpm
