SUMMARY = "Document Files for ImageMagick Library"
DESCRIPTION = "HTML documentation for ImageMagick library and scene examples."
LICENSE = "ImageMagick"

PV = "7.1.1.15"

RPM_NAME = "ImageMagick-doc-7.1.1.15-1.1.noarch.rpm"
RPM_HASH = "b9b72fa23d1023ee3027046b34e50dfd6ef97b4771239bb163554f6ce10aaa26ad1f957b72a1f85952af4cbab5992b83630e5ce9778c119be144cd512de26f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-doc"

RDEPENDS:${PN} += ""

inherit rpm
