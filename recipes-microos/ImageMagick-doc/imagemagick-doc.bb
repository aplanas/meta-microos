SUMMARY = "Document Files for ImageMagick Library"
DESCRIPTION = "HTML documentation for ImageMagick library and scene examples."
LICENSE = "ImageMagick"

PV = "7.1.1.8"

RPM_NAME = "ImageMagick-doc-7.1.1.8-1.1.noarch.rpm"
RPM_HASH = "f237d0d3cc44c85f4bd98e5aa5f707810a2b608ef4a1ad818efa137a5644ea18e246993f632904389432f1ec6c5c06e8e8a81479210445ad4e6dcdb3cbc9a37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-doc"
RDEPENDS:${PN} += ""

inherit rpm
