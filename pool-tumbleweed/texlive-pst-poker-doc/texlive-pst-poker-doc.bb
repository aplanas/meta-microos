SUMMARY = "Documentation for texlive-pst-poker"
DESCRIPTION = "This package includes the documentation for texlive-pst-poker"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-doc-2023.201.0.0.03bsvn65818-53.2.noarch.rpm"
RPM_HASH = "338b722ab819ffb0d34f3a7b356aae49c62bee454766d047d44ff2e999c8e51417f79806fb53760d0da18d970d897c747ec6730b00500a2ae85f9450c7e1bcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poker-doc"

RDEPENDS:${PN} += ""

inherit rpm
