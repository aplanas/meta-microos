SUMMARY = "Documentation for texlive-harmony"
DESCRIPTION = "This package includes the documentation for texlive-harmony"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harmony-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "0c8d9c69c7ec666eed59ce1702a1c8b048e12baa6d9dc4ce78bbfd3f2fbb68eaee97ed152982925b8e3ed3fe8efd61879a4e4ee3a63afc3b37aaa5351308239a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harmony-doc"

RDEPENDS:${PN} += ""

inherit rpm
