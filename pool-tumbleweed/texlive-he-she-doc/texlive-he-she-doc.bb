SUMMARY = "Documentation for texlive-he-she"
DESCRIPTION = "This package includes the documentation for texlive-he-she"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn41359"

RPM_NAME = "texlive-he-she-doc-2023.209.1.3svn41359-54.2.noarch.rpm"
RPM_HASH = "18a8f680ced39e719ac09373bdf76ec5af16da71bd7edb611750b56d229bac3f63852701d496364d57213396509dc2cda4191af80045f4eb972275b9606dc3e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-he-she-doc"

RDEPENDS:${PN} += ""

inherit rpm
