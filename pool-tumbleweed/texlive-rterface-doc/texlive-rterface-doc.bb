SUMMARY = "Documentation for texlive-rterface"
DESCRIPTION = "This package includes the documentation for texlive-rterface"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn30084"

RPM_NAME = "texlive-rterface-doc-2023.209.svn30084-54.1.noarch.rpm"
RPM_HASH = "cc9af0e7d70d577354af82d2d0aa7e50d89f690b931d0319c984a47f109b74cce06fef5a365e84c0ecbf3c667a3ab29eb4f4ee6e021ad50de59e950d4844701a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rterface-doc"

RDEPENDS:${PN} += ""

inherit rpm
