SUMMARY = "Documentation and examples for QCustomPlot"
DESCRIPTION = "This package contains the documentation and examples for QCustomPlot."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-doc-2.1.1-2.4.noarch.rpm"
RPM_HASH = "df3422cf3ab094c228120baae3ba2f2d25065ea1f8a9c06b93e15502c4e6c11612cc330e07d7680d9b4e5c3ee2612aef2b5e8e7020fa68867e6e9f3466ca38b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qcustomplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
