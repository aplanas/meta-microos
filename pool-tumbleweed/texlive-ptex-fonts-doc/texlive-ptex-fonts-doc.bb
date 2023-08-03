SUMMARY = "Documentation for texlive-ptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64330"

RPM_NAME = "texlive-ptex-fonts-doc-2023.209.svn64330-54.1.noarch.rpm"
RPM_HASH = "f76b6ad7c538a389f752e7f41325ac9b0e5005e786c2ff3e31d03caced9380dabe7a1c720c7d4b4ee36119c3568fc99bdd6ceeb2ec4cf68820985c86f77420ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
