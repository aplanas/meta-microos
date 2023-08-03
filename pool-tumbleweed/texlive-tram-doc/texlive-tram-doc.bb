SUMMARY = "Documentation for texlive-tram"
DESCRIPTION = "This package includes the documentation for texlive-tram"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn29803"

RPM_NAME = "texlive-tram-doc-2023.209.0.0.2svn29803-53.1.noarch.rpm"
RPM_HASH = "793c2db1908b6ab57710df0c7b43d574c5ef559b90b686cdc3f22e4370ad8a5ca456185866ac714027272aeaa98c2fe371a836280837dba4bc03f7b45b26d6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tram-doc"

RDEPENDS:${PN} += ""

inherit rpm
