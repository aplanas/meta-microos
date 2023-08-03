SUMMARY = "Documentation for texlive-beamerthemelalic"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemelalic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn58777"

RPM_NAME = "texlive-beamerthemelalic-doc-2023.209.1.0svn58777-54.1.noarch.rpm"
RPM_HASH = "fdc1c3444a3348bd731b881a12ac1659ca1a913e67b43b70540a90ea25a1168a65cbad4a14ac036c8ad08dd0dba89279890cbb9e3bcfc68103f28067e2cc3d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemelalic-doc"

RDEPENDS:${PN} += ""

inherit rpm
