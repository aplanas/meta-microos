SUMMARY = "Documentation for texlive-vgrid"
DESCRIPTION = "This package includes the documentation for texlive-vgrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn32457"

RPM_NAME = "texlive-vgrid-doc-2023.201.0.0.1svn32457-53.1.noarch.rpm"
RPM_HASH = "bd8a901ec5a0a86debd80b2ded335a2f2e06cb9cdd1ec569a5f51b7ef5cefbb92357115f08ec34fdb5e7b2ab04b1adc81c52badce206dafaa2f9c7e7c8e8c894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vgrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
