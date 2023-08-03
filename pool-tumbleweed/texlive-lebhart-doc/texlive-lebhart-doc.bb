SUMMARY = "Documentation for texlive-lebhart"
DESCRIPTION = "This package includes the documentation for texlive-lebhart"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-lebhart-doc-2023.209.svn65475-55.1.noarch.rpm"
RPM_HASH = "cc0ddef45dd264cc21fd996f1c5dfeac5c8e67b94981fdaa5646c5a27725847a35c4d4618c5344acfd436af9f8580cccf7706a77079744614629d1e890043f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lebhart-doc"

RDEPENDS:${PN} += ""

inherit rpm
