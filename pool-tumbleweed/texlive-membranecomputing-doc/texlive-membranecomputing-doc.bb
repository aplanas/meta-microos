SUMMARY = "Documentation for texlive-membranecomputing"
DESCRIPTION = "This package includes the documentation for texlive-membranecomputing"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2.1svn64627"

RPM_NAME = "texlive-membranecomputing-doc-2023.208.0.0.2.1svn64627-53.1.noarch.rpm"
RPM_HASH = "915ec573e3ad2c7ee4e49355385737e034af7afce7007b203f8b8785c8187f6540fd6b83cf0990df0552213e6db101986841f4fdb7a8eed9d4bf83d0b2647ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-membranecomputing-doc"

RDEPENDS:${PN} += ""

inherit rpm
