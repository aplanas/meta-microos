SUMMARY = "Documentation for texlive-beamerdarkthemes"
DESCRIPTION = "This package includes the documentation for texlive-beamerdarkthemes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.1svn55117"

RPM_NAME = "texlive-beamerdarkthemes-doc-2023.209.0.0.5.1svn55117-54.1.noarch.rpm"
RPM_HASH = "25b37fab116348d32f912c84d2f2b4b95564a59250a83504fce2a0e39c2c7b2fdf1a22cd4764feb3046025204f3b3887b79185dab26289ce290e7710e46c6ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerdarkthemes-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
