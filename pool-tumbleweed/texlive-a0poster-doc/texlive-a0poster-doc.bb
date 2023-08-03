SUMMARY = "Documentation for texlive-a0poster"
DESCRIPTION = "This package includes the documentation for texlive-a0poster"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.22bsvn54071"

RPM_NAME = "texlive-a0poster-doc-2023.209.1.22bsvn54071-55.1.noarch.rpm"
RPM_HASH = "0feba423d05f2c5adf2c74f18676fc4da8816d1cf06527c81d46d16d895ac13688fb5728dd18bf53219e7fddc8c1a79b006cb084afc644cb8508a4eda8e53c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-a0poster-doc-de;en \
texlive-a0poster-doc"

RDEPENDS:${PN} += ""

inherit rpm
