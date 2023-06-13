SUMMARY = "Documentation for texlive-ptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64330"

RPM_NAME = "texlive-ptex-fonts-doc-2023.201.svn64330-53.1.noarch.rpm"
RPM_HASH = "6a494bd6139ae9e6d4fa33795e837cc53ffae1a94c3c80ee3c20f9a8e6ae46f47455fb6cffac2c5a9c1f4cab6fc52df82d402139da84d8199ca02d75fcaed012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
