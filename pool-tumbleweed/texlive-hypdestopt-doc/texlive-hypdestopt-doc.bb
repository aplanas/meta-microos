SUMMARY = "Documentation for texlive-hypdestopt"
DESCRIPTION = "This package includes the documentation for texlive-hypdestopt"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn56253"

RPM_NAME = "texlive-hypdestopt-doc-2023.201.2.7svn56253-52.1.noarch.rpm"
RPM_HASH = "b74cf781004858ff7864db95bf6a42b7cadc0c53e4e02f78bd5a37ef26da6157169ad9ace0d1da1571e8273727b136216d00459fd1c9d26304612b83770189a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hypdestopt-doc:en) \
texlive-hypdestopt-doc"
RDEPENDS:${PN} += ""

inherit rpm
