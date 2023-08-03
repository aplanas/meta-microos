SUMMARY = "Documentation for texlive-filedate"
DESCRIPTION = "This package includes the documentation for texlive-filedate"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29529"

RPM_NAME = "texlive-filedate-doc-2023.209.svn29529-53.1.noarch.rpm"
RPM_HASH = "fb5dd56490323382ebd807444f68a367544f96b168395eda87a0ee3e63f55f8b239305a747e669af737263c39537f9b797a988cbfe34eeaa96ef690e08fc0d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filedate-doc"

RDEPENDS:${PN} += ""

inherit rpm
