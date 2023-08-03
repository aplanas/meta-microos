SUMMARY = "Documentation for texlive-atendofenv"
DESCRIPTION = "This package includes the documentation for texlive-atendofenv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn62164"

RPM_NAME = "texlive-atendofenv-doc-2023.209.0.0.2svn62164-54.1.noarch.rpm"
RPM_HASH = "2e4a8de3142d328bfb5d112cf0ddadedc4564e38485e9c440047456f00cb4fcef3f318ddaefe47d9ee30e6942fc44d9e6911bffc9b33e931aa2ca2af193f38c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atendofenv-doc"

RDEPENDS:${PN} += ""

inherit rpm
