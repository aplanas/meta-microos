SUMMARY = "Documentation for texlive-xwatermark"
DESCRIPTION = "This package includes the documentation for texlive-xwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-doc-2023.209.1.5.2dsvn61719-53.1.noarch.rpm"
RPM_HASH = "d3369d8bd91dfa3d97945f5e1d2c6a7e79363882f7d3a2f6e1576ae88d46a9580c3e9ebd5986374b7e051663aa2a9c42f63ab02a70adc2e5a29df63d9ac5d8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
