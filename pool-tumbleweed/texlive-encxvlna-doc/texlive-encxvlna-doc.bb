SUMMARY = "Documentation for texlive-encxvlna"
DESCRIPTION = "This package includes the documentation for texlive-encxvlna"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34087"

RPM_NAME = "texlive-encxvlna-doc-2023.209.1.1svn34087-54.1.noarch.rpm"
RPM_HASH = "9e94a8885bf356d197bbd8abc7f34974cb300471c549e1b54171b054ebe743ce2de1713d7ba3634aaaedde92396a444859d1c982b97b5fed40ed3c1a3d98536b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-encxvlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
