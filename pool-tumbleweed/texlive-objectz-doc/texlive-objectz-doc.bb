SUMMARY = "Documentation for texlive-objectz"
DESCRIPTION = "This package includes the documentation for texlive-objectz"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-objectz-doc-2023.209.svn61719-55.1.noarch.rpm"
RPM_HASH = "6a0e14b765b5697fb0ab8292cd693a6386a9271ffc8eb3ffaf8a99f3ff1b58db49b3ff0503b1e791cb1c170c50583ce6d88ab6e045d2150515bcd73fd3b98271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-objectz-doc"

RDEPENDS:${PN} += ""

inherit rpm
