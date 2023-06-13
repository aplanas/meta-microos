SUMMARY = "Documentation for texlive-fancyref"
DESCRIPTION = "This package includes the documentation for texlive-fancyref"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9csvn15878"

RPM_NAME = "texlive-fancyref-doc-2023.201.0.0.9csvn15878-52.1.noarch.rpm"
RPM_HASH = "38fe938170d506ff43343b664afa1078f9612ec1d3ca8ee649a73f921858725e477e2d35622619630b52f101a0a3ff939948f6994dbaf588707b0ab43a27b464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyref-doc"

RDEPENDS:${PN} += ""

inherit rpm
