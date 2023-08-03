SUMMARY = "Documentation for texlive-numericplots"
DESCRIPTION = "This package includes the documentation for texlive-numericplots"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.2svn31729"

RPM_NAME = "texlive-numericplots-doc-2023.209.2.0.2svn31729-55.1.noarch.rpm"
RPM_HASH = "354d526b0cbe22a969c8b8575ca29d0ce02a3c82a22ea203c15778da9a1b7453d87f58a363d55f6f218219d74aa5a75563e64a67c18da2d450ed15418e467d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numericplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
