SUMMARY = "Documentation for texlive-yfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-doc-2023.209.0.0.43svn65030-53.1.noarch.rpm"
RPM_HASH = "1862fbfeb81e54e8485d53ecbc15743f08840360bb0198780871532d6ff87b01fea706aeaa2a53394e27d292066736c8b36f0120a2b99d615e974ccfdae499d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
