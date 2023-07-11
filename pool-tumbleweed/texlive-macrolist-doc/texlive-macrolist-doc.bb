SUMMARY = "Documentation for texlive-macrolist"
DESCRIPTION = "This package includes the documentation for texlive-macrolist"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.1.0svn60139"

RPM_NAME = "texlive-macrolist-doc-2023.208.2.1.0svn60139-53.1.noarch.rpm"
RPM_HASH = "f07c598ffa456078ee7e27dd7631e2b6e744f72c44e365b55e405ea82cf3639869ff5271b98fa084a6029b7fe2e53cb33a8eade24cdd4482557260f2ee91e85c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macrolist-doc"

RDEPENDS:${PN} += ""

inherit rpm
