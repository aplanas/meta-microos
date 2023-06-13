SUMMARY = "Documentation for texlive-gfsbodoni"
DESCRIPTION = "This package includes the documentation for texlive-gfsbodoni"
LICENSE = "OFL-1.1"

PV = "2023.201.1.01svn28484"

RPM_NAME = "texlive-gfsbodoni-doc-2023.201.1.01svn28484-52.1.noarch.rpm"
RPM_HASH = "54700bc01e4f6c6b90f6cf947567ff0082775e60c83d07be08e466bd0d09e0def6f83429803fa79f971d69898595ff35ad77d55a8919ea93e948fd8870a7fa65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsbodoni-doc"

RDEPENDS:${PN} += ""

inherit rpm
