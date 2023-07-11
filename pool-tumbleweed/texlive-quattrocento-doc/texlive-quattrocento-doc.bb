SUMMARY = "Documentation for texlive-quattrocento"
DESCRIPTION = "This package includes the documentation for texlive-quattrocento"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64372"

RPM_NAME = "texlive-quattrocento-doc-2023.201.svn64372-53.2.noarch.rpm"
RPM_HASH = "d20c927a6cfe8ff071addddcaef148952729a27dd0b6845bc358cd135e785195164fcbd437db9635d120dfb4900625eba207c23246906a23cc7de73244f26e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quattrocento-doc"

RDEPENDS:${PN} += ""

inherit rpm
