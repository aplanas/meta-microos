SUMMARY = "Documentation for texlive-pst-poker"
DESCRIPTION = "This package includes the documentation for texlive-pst-poker"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-doc-2023.201.0.0.03bsvn65818-53.1.noarch.rpm"
RPM_HASH = "0659fefff808492f9466c914facd116b92a22b742245ee84c36913320fd3c17d433dafe53eb9618b59fdec04fdceb3648937f44abe7d1569d9026ee5ec558371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poker-doc"

RDEPENDS:${PN} += ""

inherit rpm
