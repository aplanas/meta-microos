SUMMARY = "Documentation for texlive-outliner"
DESCRIPTION = "This package includes the documentation for texlive-outliner"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.94svn21095"

RPM_NAME = "texlive-outliner-doc-2023.201.0.0.94svn21095-54.1.noarch.rpm"
RPM_HASH = "cd4296331d3c0993a59edcf056b3a78d086879cdea36e1b4dab5400e72406c7d1b3aa7f1c323a744652e02fc414215571a7158057cbcd6992cfd219dd1f68daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outliner-doc"
RDEPENDS:${PN} += ""

inherit rpm
