SUMMARY = "Documentation for texlive-innerscript"
DESCRIPTION = "This package includes the documentation for texlive-innerscript"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn57672"

RPM_NAME = "texlive-innerscript-doc-2023.208.1.1svn57672-53.1.noarch.rpm"
RPM_HASH = "24eb96f00bb46a3445638ad99985c1c6b540e1275ab9fc8a046b067034b879bcb23998c202c557a019eeed9597572c796a2d530a6089476efe1f7124abc24b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-innerscript-doc"

RDEPENDS:${PN} += ""

inherit rpm
