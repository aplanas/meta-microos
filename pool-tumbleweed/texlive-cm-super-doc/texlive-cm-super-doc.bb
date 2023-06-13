SUMMARY = "Documentation for texlive-cm-super"
DESCRIPTION = "This package includes the documentation for texlive-cm-super"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-cm-super-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "62546a989d8b2c13a917395fbae53ddc04c2cfca1646c87645ce0e9b0db8f4d29f89fd8fd02d32562ff6b3d31acc2bc15ef5b5b20d55761ecca877e955fd85d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-super-doc"

RDEPENDS:${PN} += ""

inherit rpm
