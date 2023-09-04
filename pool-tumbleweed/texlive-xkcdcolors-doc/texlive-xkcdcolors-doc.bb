SUMMARY = "Documentation for texlive-xkcdcolors"
DESCRIPTION = "This package includes the documentation for texlive-xkcdcolors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn54512"

RPM_NAME = "texlive-xkcdcolors-doc-2023.209.1.0.1svn54512-53.2.noarch.rpm"
RPM_HASH = "4cc4a661bb147f6d2bffdde3a0c1a43ef7e29225f76250d58fc3261d81d98b96c65172578fac176d179d7d74813178ee628bbc28d648e95fed6a0fc94638087f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkcdcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
