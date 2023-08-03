SUMMARY = "Documentation for texlive-beamertheme-metropolis"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-metropolis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn43031"

RPM_NAME = "texlive-beamertheme-metropolis-doc-2023.209.1.2svn43031-54.1.noarch.rpm"
RPM_HASH = "fb5fe708a8e950f0593cc8ec3448ad03c06747dcc19d2e5623a69b18004f7970b44b2ecef350be65f5edd480c4ffcad2036dcff021c4be097ad87afe2ddddba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-metropolis-doc"

RDEPENDS:${PN} += ""

inherit rpm
