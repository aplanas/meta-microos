SUMMARY = "Documentation for texlive-exercise"
DESCRIPTION = "This package includes the documentation for texlive-exercise"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn35417"

RPM_NAME = "texlive-exercise-doc-2023.201.1.6svn35417-52.1.noarch.rpm"
RPM_HASH = "6c0905ab34b7a2fc395b55d286748a996b8e9cd732f32efdca06805333d7dd9549db25587715bac7ba7ea9ea79296c4ee002bd8744ff91a4f1a6d4b49f820c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercise-doc"

RDEPENDS:${PN} += ""

inherit rpm
