SUMMARY = "Documentation for texlive-hyperxmp"
DESCRIPTION = "This package includes the documentation for texlive-hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.11svn65980"

RPM_NAME = "texlive-hyperxmp-doc-2023.209.5.11svn65980-54.1.noarch.rpm"
RPM_HASH = "47e6dea36e0b5184573d30a25420b29939cb1501c63bb53321a11ec3038624d446b2208ed5c5b45ad062c0854af83985135a362762a291b2932364adbaf5594c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hyperxmp-add-bytecount.1 \
texlive-hyperxmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
