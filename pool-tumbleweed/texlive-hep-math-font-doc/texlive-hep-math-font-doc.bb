SUMMARY = "Documentation for texlive-hep-math-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-math-font"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-doc-2023.201.1.1svn64901-53.2.noarch.rpm"
RPM_HASH = "34e4ecfe9cc94434ab1e44d46d78387d902396316dc546d0fc792441d602fef62dafa807a5d2e0e413eee6163049b9607107d8f36926b2596c1c4f1e934be211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
