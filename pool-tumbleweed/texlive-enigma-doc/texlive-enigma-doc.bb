SUMMARY = "Documentation for texlive-enigma"
DESCRIPTION = "This package includes the documentation for texlive-enigma"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.1svn29802"

RPM_NAME = "texlive-enigma-doc-2023.209.0.0.1svn29802-54.1.noarch.rpm"
RPM_HASH = "cc43583e756181644239b785a48e9fb03a833e2bcebec693b56a50dd0fff6785c10e90e9e08a1eb250ed5e33917ad5660721643541d08814d3bc16470ddbb21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enigma-doc"

RDEPENDS:${PN} += ""

inherit rpm
