SUMMARY = "Script to create Indices for FOP"
DESCRIPTION = " \
Contains the script pdf2index which creates indices for FOP."
LICENSE = "MIT & MPL-1.1"

PV = "1.79.2.1"

RPM_NAME = "docbook-xsl-pdf2index-1.79.2.1-1.1.noarch.rpm"
RPM_HASH = "b5e742ec14ef468dbd5e92119fc4415531cf3d76fa3f374e5d8717e9eb15778f6f90631d138b4274c4c0183481f7c50bcf09df457d9dc7adf088e35495b2556b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-xsl-pdf2index"
RDEPENDS:${PN} += "/usr/bin/perl \
ImageMagick \
perl"

inherit rpm
