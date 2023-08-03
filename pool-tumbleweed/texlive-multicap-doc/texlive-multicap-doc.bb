SUMMARY = "Documentation for texlive-multicap"
DESCRIPTION = "This package includes the documentation for texlive-multicap"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-multicap-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "1b70211d47eb4f7225c7fc499be1ef090f22b44f4bd4ad426839f933e921b44b02b819e3857ea6e902b67a62e6d98e1ecb3f50be5c21aebb1efb40944f5f5511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multicap-doc"

RDEPENDS:${PN} += ""

inherit rpm
