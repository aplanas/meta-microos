SUMMARY = "Documentation for texlive-physunits"
DESCRIPTION = "This package includes the documentation for texlive-physunits"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn58728"

RPM_NAME = "texlive-physunits-doc-2023.209.1.2.0svn58728-52.1.noarch.rpm"
RPM_HASH = "3d0fda66442d88322c0e58b14c9a58b10ba53c79a396dbcd98446ee7d07cc88574a48167b5cc0fe8a210a356c495b7508b21899e504dc08a4381a60e8660ea24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
