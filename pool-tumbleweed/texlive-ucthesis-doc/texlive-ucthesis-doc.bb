SUMMARY = "Documentation for texlive-ucthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn15878"

RPM_NAME = "texlive-ucthesis-doc-2023.209.3.2svn15878-54.1.noarch.rpm"
RPM_HASH = "11c425dc17a43564d9d42ac597c64a8a50de55a1dda4bc67955af8a031d849b3973aeeda598752fee30404ee2c6577aa5b4887061b64dfacf506b9a8bcafc8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
