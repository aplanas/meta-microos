SUMMARY = "Documentation for texlive-braille"
DESCRIPTION = "This package includes the documentation for texlive-braille"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20655"

RPM_NAME = "texlive-braille-doc-2023.209.svn20655-53.1.noarch.rpm"
RPM_HASH = "aaf9d3f191f23bb8ae61082ccd6e296415bdc441770361d93ffea0ebca1ee14bc1ef45c38c1cbf8471c12f331db6e42fd0a68263feec06dbdc5e017ed0753ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braille-doc"

RDEPENDS:${PN} += ""

inherit rpm
