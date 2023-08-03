SUMMARY = "Documentation for texlive-abraces"
DESCRIPTION = "This package includes the documentation for texlive-abraces"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64967"

RPM_NAME = "texlive-abraces-doc-2023.209.2.1svn64967-55.1.noarch.rpm"
RPM_HASH = "7eb6137cee69ad2f22b5dd7c1c42bd9d2251c4dbc13ebc1ed5b0d247ef4af144828b1662443fc991b26143fa9b3e4a76f6362771f9103287d6a584d828816932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abraces-doc"

RDEPENDS:${PN} += ""

inherit rpm
