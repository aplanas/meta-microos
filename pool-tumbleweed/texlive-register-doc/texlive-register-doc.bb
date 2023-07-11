SUMMARY = "Documentation for texlive-register"
DESCRIPTION = "This package includes the documentation for texlive-register"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn54485"

RPM_NAME = "texlive-register-doc-2023.201.2.0svn54485-53.2.noarch.rpm"
RPM_HASH = "0b5f25475a54e2e2e98cdf4a276224bd760c8e7b2b641f43e1985c1937ba757951a8ee4c123bfe1ea1a86e731dc5e87e579caf704dd7b780820400de3b3bf490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Reg-macro \
texlive-register-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
