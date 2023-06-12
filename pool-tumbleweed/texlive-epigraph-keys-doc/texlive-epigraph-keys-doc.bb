SUMMARY = "Documentation for texlive-epigraph-keys"
DESCRIPTION = "This package includes the documentation for texlive-epigraph-keys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-doc-2023.201.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "bf53adafe991592bd54af96ded30314227369f377ae95f9b935adf354cf59bfd46f58e42870f9621bb2d703a0c4c934bb618c31653d58329d07bce5333c2b512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-keys-doc"
RDEPENDS:${PN} += ""

inherit rpm
