SUMMARY = "Documentation for texlive-graphpaper"
DESCRIPTION = "This package includes the documentation for texlive-graphpaper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63116"

RPM_NAME = "texlive-graphpaper-doc-2023.209.1.1svn63116-54.1.noarch.rpm"
RPM_HASH = "4ca89f87a3e30032fa223377201e9eae2aeae45fa771a31427ee8236e689a22f9b3f8e089621fe87f2218e3de336185da076b41d553af9c9f0970ad3c0cf91a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
