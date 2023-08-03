SUMMARY = "Documentation for texlive-scholax"
DESCRIPTION = "This package includes the documentation for texlive-scholax"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.033svn61836"

RPM_NAME = "texlive-scholax-doc-2023.209.1.033svn61836-54.1.noarch.rpm"
RPM_HASH = "146bea0029cb5c151a80c5b00518a69e0501547469864bd8ed4316e9ab2d694c5a53dbcc1ae429e8ffefe1f17734f54b827119a815e742fd97547d0f2e2c7c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scholax-doc"

RDEPENDS:${PN} += ""

inherit rpm
