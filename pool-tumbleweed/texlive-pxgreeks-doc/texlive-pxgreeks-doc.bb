SUMMARY = "Documentation for texlive-pxgreeks"
DESCRIPTION = "This package includes the documentation for texlive-pxgreeks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-doc-2023.201.1.0svn21838-53.2.noarch.rpm"
RPM_HASH = "f2c314e4095578da45cc92e9ed8340bfad7a8c8344282c0d6a0f1acd36e5db270ab41629203c3169c1446b9757baeaa94643295a788d28c7b89955a36b23a6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
