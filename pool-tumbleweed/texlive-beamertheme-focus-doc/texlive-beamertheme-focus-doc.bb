SUMMARY = "Documentation for texlive-beamertheme-focus"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-focus"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.3.0svn62551"

RPM_NAME = "texlive-beamertheme-focus-doc-2023.209.3.3.0svn62551-54.1.noarch.rpm"
RPM_HASH = "dfe5f30c0c798b03101a8a82e7a9fada08ec788c13fee934e2139799607ba5f9186692ce4a0384ad348b6f4eb5d25252102ee3d48df6a73c1732fd052b835b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-focus-doc"

RDEPENDS:${PN} += ""

inherit rpm
