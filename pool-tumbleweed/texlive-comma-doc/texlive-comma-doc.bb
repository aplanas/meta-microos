SUMMARY = "Documentation for texlive-comma"
DESCRIPTION = "This package includes the documentation for texlive-comma"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18259"

RPM_NAME = "texlive-comma-doc-2023.201.1.2svn18259-53.1.noarch.rpm"
RPM_HASH = "8e788a3360c50a463a69af10d093d3b3883d75099ceb7cb712fbb3409adc8d9aa33b69cab7cf69b9864a4499fff25f1c3b8ede96f927711ab59d8bdc08323e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comma-doc"
RDEPENDS:${PN} += ""

inherit rpm
