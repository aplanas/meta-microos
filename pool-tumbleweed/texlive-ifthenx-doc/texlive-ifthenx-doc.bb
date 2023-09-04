SUMMARY = "Documentation for texlive-ifthenx"
DESCRIPTION = "This package includes the documentation for texlive-ifthenx"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-doc-2023.209.0.0.1asvn25819-54.1.noarch.rpm"
RPM_HASH = "30d6b7993ca069ecfed6a533988caff863770096537af127a382c7cd3e4b515414d242676244a745e05fcd5dac23888b7539a0ed4864bdfe08373e01c3ddfa64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifthenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
