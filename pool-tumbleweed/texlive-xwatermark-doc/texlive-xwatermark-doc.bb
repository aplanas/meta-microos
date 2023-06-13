SUMMARY = "Documentation for texlive-xwatermark"
DESCRIPTION = "This package includes the documentation for texlive-xwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-doc-2023.201.1.5.2dsvn61719-52.1.noarch.rpm"
RPM_HASH = "b8c2eafc594844f40cbc5bec4c6af0a5e54f46dee5dacbfad69f2df5283ca8f676329572f74ebf7f65ab80647a440afc0350ea51f81320b823a741ad9e97b72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
