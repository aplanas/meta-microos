SUMMARY = "Documentation for texlive-grabbox"
DESCRIPTION = "This package includes the documentation for texlive-grabbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65223"

RPM_NAME = "texlive-grabbox-doc-2023.209.1.4svn65223-54.1.noarch.rpm"
RPM_HASH = "689c746f58a2eaa980452fe85553c35cc4871a7fb1a5d23f46014deece221cbf9bfd12beac23e00e36274a32fba0efb71eb3a08d041feb0d29050139b21f8d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grabbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
