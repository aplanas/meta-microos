SUMMARY = "Documentation for texlive-incgraph"
DESCRIPTION = "This package includes the documentation for texlive-incgraph"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.0svn60810"

RPM_NAME = "texlive-incgraph-doc-2023.208.1.2.0svn60810-53.1.noarch.rpm"
RPM_HASH = "f4020aac8cc736a4ca9a0c81bbff0697d6c4610ac7bc6adc7ae541418a829285f01ab0f57e7e1de2e9bf29b0ce03d8c7b4cf14f49ac178911d61462b21cf8948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-incgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
