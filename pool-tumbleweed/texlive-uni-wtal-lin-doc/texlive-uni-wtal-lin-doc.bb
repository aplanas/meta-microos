SUMMARY = "Documentation for texlive-uni-wtal-lin"
DESCRIPTION = "This package includes the documentation for texlive-uni-wtal-lin"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn31409"

RPM_NAME = "texlive-uni-wtal-lin-doc-2023.201.0.0.2svn31409-53.1.noarch.rpm"
RPM_HASH = "d723f66c0eb831ad94b6147f3a5892ab0171cf8c4bdce2abf0323e8b08426623fe9737cddf67d94f1c4fe943cdced911cd66b3414220391f8c600020c82ec333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uni-wtal-lin-doc-de;en \
texlive-uni-wtal-lin-doc"

RDEPENDS:${PN} += ""

inherit rpm
