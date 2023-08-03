SUMMARY = "Documentation for texlive-starfont"
DESCRIPTION = "This package includes the documentation for texlive-starfont"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn19982"

RPM_NAME = "texlive-starfont-doc-2023.209.1.2svn19982-58.1.noarch.rpm"
RPM_HASH = "71bcd1b7f117ceb6bb95bdc3245f5258608dca64baaece04d992c9b323f45c5ccb65beb6029694e57b1fe71b524fac06fcd2711cb7f98a4972bda5a8b7447d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-starfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
