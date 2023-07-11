SUMMARY = "Documentation for texlive-hyperxmp"
DESCRIPTION = "This package includes the documentation for texlive-hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.208.5.11svn65980"

RPM_NAME = "texlive-hyperxmp-doc-2023.208.5.11svn65980-53.1.noarch.rpm"
RPM_HASH = "1db4b3d10e514a7188c84cd992314d41379408da0bab4434104b28e54f1c7a1f6163072791b47dd80e5a255f4f5392e5e518a19e318aee81f60f01cfe3b226bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hyperxmp-add-bytecount.1 \
texlive-hyperxmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
