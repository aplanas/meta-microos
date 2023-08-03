SUMMARY = "Documentation for texlive-xmpincl"
DESCRIPTION = "This package includes the documentation for texlive-xmpincl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.4svn60593"

RPM_NAME = "texlive-xmpincl-doc-2023.209.2.4svn60593-53.1.noarch.rpm"
RPM_HASH = "e3c4d8f48d26f690e22053ff0f581834c3c6298ce79b67ee638100b81200eaf9b843cfeaafc6c6443fb46f8214f8b4affcdf50e3de9717f61982c0c86aa6d39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmpincl-doc"

RDEPENDS:${PN} += ""

inherit rpm
