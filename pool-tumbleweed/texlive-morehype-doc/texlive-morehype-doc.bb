SUMMARY = "Documentation for texlive-morehype"
DESCRIPTION = "This package includes the documentation for texlive-morehype"
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.83svn38815"

RPM_NAME = "texlive-morehype-doc-2023.209.r0.83svn38815-55.1.noarch.rpm"
RPM_HASH = "90f102f4806c3a67b07eea415ab12ad9a736ad47c3f1b14903d8cb7c86a8e0c3eb44174419856298f72fe9007ac34dadfd001bcd1a00026cd4cc897b34421588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morehype-doc"

RDEPENDS:${PN} += ""

inherit rpm
