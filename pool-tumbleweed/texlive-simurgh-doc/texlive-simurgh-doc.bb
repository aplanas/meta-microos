SUMMARY = "Documentation for texlive-simurgh"
DESCRIPTION = "This package includes the documentation for texlive-simurgh"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.01bsvn31719"

RPM_NAME = "texlive-simurgh-doc-2023.209.0.0.01bsvn31719-58.1.noarch.rpm"
RPM_HASH = "dfe863ea25adcfbafad4f63243f5d63980219cef640363f472948715ec684c3fdf619de43a359d32fe3919d42b8988190d9c05ddb27cefd1c790660169a98913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simurgh-doc"

RDEPENDS:${PN} += ""

inherit rpm
