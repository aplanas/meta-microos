SUMMARY = "Documentation for texlive-texplate"
DESCRIPTION = "This package includes the documentation for texlive-texplate"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.4svn61719"

RPM_NAME = "texlive-texplate-doc-2023.201.1.0.4svn61719-54.1.noarch.rpm"
RPM_HASH = "1bc0651109ceed2042cd7d71b597b8dfd9d92e9864ab15141a7ceccd0aca3398f571be89933fec1a03d3089e3a48e63663b4bd3c93192be3ce57aa3f0a755688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texplate-doc"

RDEPENDS:${PN} += ""

inherit rpm
