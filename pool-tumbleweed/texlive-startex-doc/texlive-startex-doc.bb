SUMMARY = "Documentation for texlive-startex"
DESCRIPTION = "This package includes the documentation for texlive-startex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.04svn35718"

RPM_NAME = "texlive-startex-doc-2023.201.1.04svn35718-57.1.noarch.rpm"
RPM_HASH = "7a797be1e9ed8cadb62550a867a6e8328371f66e648037d259d8eb510552685b1cd91ab05fefcb1178fa7adcd0b79806affb79bd895d314f05b8b80f4726608f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-startex-doc"
RDEPENDS:${PN} += ""

inherit rpm
