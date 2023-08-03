SUMMARY = "Documentation for texlive-othello"
DESCRIPTION = "This package includes the documentation for texlive-othello"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-othello-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "38bff6dac83f0040ce45b422152ace7fc673e0e5823cbdb53cbef369f6bc510888ef89093ebc0d82d137e6e89e9c86f24671163247caca1935671d434c0975a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-othello-doc"

RDEPENDS:${PN} += ""

inherit rpm
