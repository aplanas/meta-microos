SUMMARY = "Documentation for texlive-cooltooltips"
DESCRIPTION = "This package includes the documentation for texlive-cooltooltips"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn60201"

RPM_NAME = "texlive-cooltooltips-doc-2023.209.1.1svn60201-55.1.noarch.rpm"
RPM_HASH = "bd7d5d2d407d994a6305b55ffb8dbbd05595573fb0bbaf68d005aea97da3bd78ffd04fb7e03c012aa43f8c9e468830e6642b6419a40e87dd25f65e652f08e332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooltooltips-doc"

RDEPENDS:${PN} += ""

inherit rpm
