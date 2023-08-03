SUMMARY = "Documentation for texlive-pdfsync"
DESCRIPTION = "This package includes the documentation for texlive-pdfsync"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20373"

RPM_NAME = "texlive-pdfsync-doc-2023.209.svn20373-52.1.noarch.rpm"
RPM_HASH = "dd78678377ac8c082515673f8d972c5952c55e36782d2793e40231d2896b32fffe2a93f5e2f8ad9e94c6416befb636c39f398074f6a056ac5a78f09c8dc8349c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfsync-doc"

RDEPENDS:${PN} += ""

inherit rpm
