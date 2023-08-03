SUMMARY = "Documentation for texlive-graphicxpsd"
DESCRIPTION = "This package includes the documentation for texlive-graphicxpsd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-doc-2023.209.1.2svn57341-54.1.noarch.rpm"
RPM_HASH = "dc06f5eaeb86b406465c0394735e3309cc26715a453cb0d0b1568a6aa7e058200c27032f74497a2ad5f9add81789b1a0f4610063947e98a2924d9d2aea674672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxpsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
