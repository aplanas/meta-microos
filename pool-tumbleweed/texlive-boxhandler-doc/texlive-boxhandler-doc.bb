SUMMARY = "Documentation for texlive-boxhandler"
DESCRIPTION = "This package includes the documentation for texlive-boxhandler"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn28031"

RPM_NAME = "texlive-boxhandler-doc-2023.209.1.30svn28031-53.1.noarch.rpm"
RPM_HASH = "73a81ba05692e715af6880c6429a3dfe431fe52ab6d5af524ec0597e7865e0028b2d27f99f73415f9154be609cd7718fd7f714a002ae6997830a654fa7a64fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boxhandler-doc"

RDEPENDS:${PN} += ""

inherit rpm
