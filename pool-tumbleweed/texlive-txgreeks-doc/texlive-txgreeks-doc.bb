SUMMARY = "Documentation for texlive-txgreeks"
DESCRIPTION = "This package includes the documentation for texlive-txgreeks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21839"

RPM_NAME = "texlive-txgreeks-doc-2023.201.1.0svn21839-52.1.noarch.rpm"
RPM_HASH = "aceda7ac3b2451fe39b9d798737d94c613c92376bc8a78a397418edf2123d0be239b47641f17c661f76d953599fefbf5b1c80f32c65fe51d8864cfebfdefc53c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txgreeks-doc"
RDEPENDS:${PN} += ""

inherit rpm
