SUMMARY = "Documentation for texlive-keyvaltable"
DESCRIPTION = "This package includes the documentation for texlive-keyvaltable"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn65416"

RPM_NAME = "texlive-keyvaltable-doc-2023.201.2.3svn65416-55.1.noarch.rpm"
RPM_HASH = "cd44500c7c8171384dba5b1761d57c67afae3608ca4bff19c4fcf52a2c0fa4f73315269ad67abeb1584ffae6cff5d459e32bb1b2eb0486df1193d2eb87c5a590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyvaltable-doc"
RDEPENDS:${PN} += ""

inherit rpm
