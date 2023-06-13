SUMMARY = "Documentation for texlive-easyformat"
DESCRIPTION = "This package includes the documentation for texlive-easyformat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-doc-2023.201.1.4.0svn44543-53.1.noarch.rpm"
RPM_HASH = "334f634329323253badf27ffe007cd4640e77e5773c9b5207a6d4376f9e95f5c263f289e02ee7ad2c28a9656ade57d73f593e7d0f0c8bbadc924e47b0f058f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
