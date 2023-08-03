SUMMARY = "Documentation for texlive-babel-albanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-albanian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0dsvn57005"

RPM_NAME = "texlive-babel-albanian-doc-2023.209.1.0dsvn57005-54.1.noarch.rpm"
RPM_HASH = "883b4d54b8d110e189e15d338e87b4016738a11452757f2cb0a73a7f601777ba78cf3955eec1c2aa0185bb0d90ca9fca8a46879942fbe80c601459fd727acc91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-albanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
