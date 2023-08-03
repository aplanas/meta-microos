SUMMARY = "Documentation for texlive-trivfloat"
DESCRIPTION = "This package includes the documentation for texlive-trivfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3bsvn15878"

RPM_NAME = "texlive-trivfloat-doc-2023.209.1.3bsvn15878-53.1.noarch.rpm"
RPM_HASH = "556c95b2dcf8c79eb0f1ea15dfd8b0587391c31ad72c211c3f5323375a826942cd8ee0f4cb06575421e9439e8b68d2a441e1d467f5f6274936b6a68a7ab19aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trivfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
