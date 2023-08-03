SUMMARY = "Documentation for texlive-plstmary"
DESCRIPTION = "This package includes the documentation for texlive-plstmary"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.5csvn31088"

RPM_NAME = "texlive-plstmary-doc-2023.209.0.0.5csvn31088-53.1.noarch.rpm"
RPM_HASH = "549a20ffaf13c956b6d345d3e4bff6928610214e663598c250c772d524cc69ca3bed9e85bb01daf122180458f4403e8552dbf4e4a5ccf334ef57dbbddab110fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plstmary-doc"

RDEPENDS:${PN} += ""

inherit rpm
