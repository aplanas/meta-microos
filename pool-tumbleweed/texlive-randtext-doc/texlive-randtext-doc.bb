SUMMARY = "Documentation for texlive-randtext"
DESCRIPTION = "This package includes the documentation for texlive-randtext"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-randtext-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "bc674923aa7f39cc358c2b6afa1e975f799239f209f8fdb6f9dc0f48e7a65e09e6d166116f5161047fad3710cd91bc0ab250d64a211ca42fe7c2450831308d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
