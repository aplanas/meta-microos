SUMMARY = "Documentation for texlive-prociagssymp"
DESCRIPTION = "This package includes the documentation for texlive-prociagssymp"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63242"

RPM_NAME = "texlive-prociagssymp-doc-2023.209.svn63242-53.1.noarch.rpm"
RPM_HASH = "613c1004cae25f28fb2dd7a847e1a7a8f668053837582c4222d3db436bc090eb40570f466dc48100ed4a1ac80a3d6969d337cf38d6f1ab8c713599331d556b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prociagssymp-doc"

RDEPENDS:${PN} += ""

inherit rpm
