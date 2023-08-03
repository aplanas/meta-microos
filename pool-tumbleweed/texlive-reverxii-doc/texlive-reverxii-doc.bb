SUMMARY = "Documentation for texlive-reverxii"
DESCRIPTION = "This package includes the documentation for texlive-reverxii"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63753"

RPM_NAME = "texlive-reverxii-doc-2023.209.svn63753-54.1.noarch.rpm"
RPM_HASH = "c245f6352f950e8efde0deb1dee05ae69ceeeb617b9ace95515847b674994f5f69e41e94cfb8f8fdbb58eb3dcaa53e4b264063a26f6758d8f2aeba404705d52c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reverxii-doc"

RDEPENDS:${PN} += ""

inherit rpm
