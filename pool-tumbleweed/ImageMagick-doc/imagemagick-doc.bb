SUMMARY = "Document Files for ImageMagick Library"
DESCRIPTION = "HTML documentation for ImageMagick library and scene examples."
LICENSE = "ImageMagick"

PV = "7.1.1.12"

RPM_NAME = "ImageMagick-doc-7.1.1.12-1.1.noarch.rpm"
RPM_HASH = "1ae0311207a0641b5b0d6366d2a538c6d013ea8f0823044b5e528d9a0db0d5eed0d48a1155f9c7ef0965f78975c61f1ffad47b5d81ac37ded776af26a53e3f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-doc"

RDEPENDS:${PN} += ""

inherit rpm
