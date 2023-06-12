SUMMARY = "Documentation for texlive-photobook"
DESCRIPTION = "This package includes the documentation for texlive-photobook"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.1.10svn66551"

RPM_NAME = "texlive-photobook-doc-2023.201.0.0.1.10svn66551-51.1.noarch.rpm"
RPM_HASH = "146e2aecf76c6aaea0e6387c3711e89436d305f73ac395298d43114e83b969437278508904cacd48c9b6eb501497e27ad25b71329bd8bbdbcb15f4b1bb19a916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-photobook-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
