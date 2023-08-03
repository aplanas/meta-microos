SUMMARY = "Documentation for texlive-cprotect"
DESCRIPTION = "This package includes the documentation for texlive-cprotect"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn21209"

RPM_NAME = "texlive-cprotect-doc-2023.209.1.0esvn21209-55.1.noarch.rpm"
RPM_HASH = "6e3acfe34856923b736442c68c2b8a876552d549ea881e00a0b43c9dce62192da670c1159476416c694340fc26cbfcf5b666231089bcc13e3ba627e113a103b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cprotect-doc"

RDEPENDS:${PN} += ""

inherit rpm
