SUMMARY = "Documentation for texlive-kerntest"
DESCRIPTION = "This package includes the documentation for texlive-kerntest"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.32svn15878"

RPM_NAME = "texlive-kerntest-doc-2023.209.1.32svn15878-56.1.noarch.rpm"
RPM_HASH = "a1d299ae70418b333dad4bb06cb9f70f0db7a888842803a08a15bb3a633ecb4f69b7e8ee83a1f4d8418e2f666bb58df326f5d6300155574b8d7f49fd533c58ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kerntest-doc"

RDEPENDS:${PN} += ""

inherit rpm
