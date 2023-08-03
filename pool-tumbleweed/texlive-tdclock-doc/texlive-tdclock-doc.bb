SUMMARY = "Documentation for texlive-tdclock"
DESCRIPTION = "This package includes the documentation for texlive-tdclock"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.5svn33043"

RPM_NAME = "texlive-tdclock-doc-2023.209.2.5svn33043-55.1.noarch.rpm"
RPM_HASH = "3e2d33279daae1255f133b4ab7e47bbb737390689be798bd05546e427e14ab65d6d97162968fc449451172a59385f4354bb2c15f41aef87507de1daefa998e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tdclock-doc"

RDEPENDS:${PN} += ""

inherit rpm
