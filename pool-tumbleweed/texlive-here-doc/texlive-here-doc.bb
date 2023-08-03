SUMMARY = "Documentation for texlive-here"
DESCRIPTION = "This package includes the documentation for texlive-here"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16135"

RPM_NAME = "texlive-here-doc-2023.209.svn16135-54.1.noarch.rpm"
RPM_HASH = "e1ab29aa4a8f2b37fdd013a545d14ea41683b383177d1828e119afc4f174a34ed894d596faeb3b9a40b657db2c697bb0f3fe078af80e5d2e6dc5163646c1db21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-here-doc"

RDEPENDS:${PN} += ""

inherit rpm
