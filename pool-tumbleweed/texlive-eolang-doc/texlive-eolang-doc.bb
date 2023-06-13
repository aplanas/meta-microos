SUMMARY = "Documentation for texlive-eolang"
DESCRIPTION = "This package includes the documentation for texlive-eolang"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-doc-2023.201.0.0.12.1svn66274-53.1.noarch.rpm"
RPM_HASH = "f1fff98ee1de0d654a8e4b6b56ffea610f432f0c73dbfd713411b7d56013d4024973100fe3315124ad69359f21e5718839726d92d91529cae49eba59d7fb8053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eolang-doc"

RDEPENDS:${PN} += ""

inherit rpm
