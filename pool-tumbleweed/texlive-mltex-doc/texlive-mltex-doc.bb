SUMMARY = "Documentation for texlive-mltex"
DESCRIPTION = "This package includes the documentation for texlive-mltex"
LICENSE = "SUSE-TeX"

PV = "2023.209.2.2svn62145"

RPM_NAME = "texlive-mltex-doc-2023.209.2.2svn62145-55.1.noarch.rpm"
RPM_HASH = "130ce53fc3a6df54f59062cda35e372ba3058a7bedac79ac1cc6789aa82f0b44a9ca3df813444cb486ab8dddbceef3fc9ea1c9b60d8c1df88051deb440042689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
