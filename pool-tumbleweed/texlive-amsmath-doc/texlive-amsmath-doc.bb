SUMMARY = "Documentation for texlive-amsmath"
DESCRIPTION = "This package includes the documentation for texlive-amsmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63514"

RPM_NAME = "texlive-amsmath-doc-2023.209.svn63514-55.1.noarch.rpm"
RPM_HASH = "809c175888978af0700d3021c79f0212b099191591f5d2a99d59be352f1fbabc0ed2001f84da9b44e64c76a8ba7609e8ddb8922b1a14c60499000876c5cbda00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-amsmath-doc-en \
texlive-amsmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
