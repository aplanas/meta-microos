SUMMARY = "Documentation for texlive-changelog"
DESCRIPTION = "This package includes the documentation for texlive-changelog"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.0svn65861"

RPM_NAME = "texlive-changelog-doc-2023.209.2.5.0svn65861-53.1.noarch.rpm"
RPM_HASH = "ab2cd713a71bc422d720ac03f92b3a2a7103f7e0b7bd129309ff97c3b8533a04c714fb7901bba45eeb139babfb4ac5a4a2c695b636ae7dc965cb9f55a3ccd6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changelog-doc"

RDEPENDS:${PN} += ""

inherit rpm
