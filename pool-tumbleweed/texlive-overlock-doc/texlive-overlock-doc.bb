SUMMARY = "Documentation for texlive-overlock"
DESCRIPTION = "This package includes the documentation for texlive-overlock"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64495"

RPM_NAME = "texlive-overlock-doc-2023.209.svn64495-52.1.noarch.rpm"
RPM_HASH = "68bbc2a4455644f8e2003d6350780ad002ef49db1ca98c675ce9cfe9b414831f9da456f0c71331c66d099fec0f4baebeff576b3347f83d5ef7856458ac7c9fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overlock-doc"

RDEPENDS:${PN} += ""

inherit rpm
