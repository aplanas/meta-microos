SUMMARY = "Documentation for texlive-photobook"
DESCRIPTION = "This package includes the documentation for texlive-photobook"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.1.10svn66551"

RPM_NAME = "texlive-photobook-doc-2023.209.0.0.1.10svn66551-52.1.noarch.rpm"
RPM_HASH = "f4b86f5dc106e9c2460b27a675c5bb343eed4fc116ba1a743dea7b20f71039236bccc5cd120420c9b4a6ecc7e04e392f3bc919ece567d7842721a6c327ccb91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-photobook-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
