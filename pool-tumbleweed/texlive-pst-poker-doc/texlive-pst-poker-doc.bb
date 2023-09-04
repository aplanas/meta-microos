SUMMARY = "Documentation for texlive-pst-poker"
DESCRIPTION = "This package includes the documentation for texlive-pst-poker"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-doc-2023.209.0.0.03bsvn65818-54.2.noarch.rpm"
RPM_HASH = "b7c7d046d15d544a2de2300acd7b7ff74c471fa95972c4ac48ba0c710a292212feaa5f40a7be5f758524c286329404e9ad21044f14c31d655a53f5c0505dc2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poker-doc"

RDEPENDS:${PN} += ""

inherit rpm
