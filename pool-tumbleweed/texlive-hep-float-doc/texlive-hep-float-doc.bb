SUMMARY = "Documentation for texlive-hep-float"
DESCRIPTION = "This package includes the documentation for texlive-hep-float"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64904"

RPM_NAME = "texlive-hep-float-doc-2023.209.1.1svn64904-54.1.noarch.rpm"
RPM_HASH = "dbf79815a755be8c991c27d27d0722ee61ee01b14b5bf771152dea29ea2593a91d094385e08cbafa4ce0cc836aa7f04c0ef0dc1340d54426d4b9d1bd5ca0fdc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-float-doc"

RDEPENDS:${PN} += ""

inherit rpm
