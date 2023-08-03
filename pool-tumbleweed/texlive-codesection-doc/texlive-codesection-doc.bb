SUMMARY = "Documentation for texlive-codesection"
DESCRIPTION = "This package includes the documentation for texlive-codesection"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34481"

RPM_NAME = "texlive-codesection-doc-2023.209.0.0.1svn34481-54.1.noarch.rpm"
RPM_HASH = "a607b728ddf8624e181e67928fca8dbb4ec932e291097e18098ae9127853089456063f0c3497cd92934b0660917dc48bb10a29e5d4f1fd4f54456c9ff0827197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codesection-doc"

RDEPENDS:${PN} += ""

inherit rpm
