SUMMARY = "Documentation for texlive-beamerswitch"
DESCRIPTION = "This package includes the documentation for texlive-beamerswitch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn64182"

RPM_NAME = "texlive-beamerswitch-doc-2023.209.1.9svn64182-54.1.noarch.rpm"
RPM_HASH = "c0f5db333d703ee61f05b171901a314ae824c6eff8415a8ee50c4eb00d56ac93a839c1b3e0335017846a0e8947c395c6cae703e86e780e1eddd372aee302074f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerswitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
