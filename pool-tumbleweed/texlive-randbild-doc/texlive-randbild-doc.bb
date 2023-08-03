SUMMARY = "Documentation for texlive-randbild"
DESCRIPTION = "This package includes the documentation for texlive-randbild"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-randbild-doc-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "4680613afdbde750c38072a1729cd28c00c32f4e2e466f8aa5c9c1cc765736dcfc966a377bea766a0f801ffbd77e82e74feeea034139fb486ea1629a2bc43706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-randbild-doc-de \
texlive-randbild-doc"

RDEPENDS:${PN} += ""

inherit rpm
