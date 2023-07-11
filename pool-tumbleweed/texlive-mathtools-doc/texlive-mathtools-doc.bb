SUMMARY = "Documentation for texlive-mathtools"
DESCRIPTION = "This package includes the documentation for texlive-mathtools"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.29svn63767"

RPM_NAME = "texlive-mathtools-doc-2023.208.1.29svn63767-53.1.noarch.rpm"
RPM_HASH = "821f69b7bc48909d44c24b8c096e476edb32f02093d7889ad4957fe5074b5cf297a63dbf09dc581039f18430b9c65946d94d7bc3707ab4e51763309143a76319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
