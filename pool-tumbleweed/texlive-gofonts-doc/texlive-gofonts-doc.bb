SUMMARY = "Documentation for texlive-gofonts"
DESCRIPTION = "This package includes the documentation for texlive-gofonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64358"

RPM_NAME = "texlive-gofonts-doc-2023.201.svn64358-53.1.noarch.rpm"
RPM_HASH = "1d8bb168d681fd60f63d12b1005c32fd0c20d50c0b592035dece8539d4352b009575408e1b44b2b0676d8bb96d9802fdbaf596e45887c7dec574b3f30379047b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gofonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
