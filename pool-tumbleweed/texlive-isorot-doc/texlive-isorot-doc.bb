SUMMARY = "Documentation for texlive-isorot"
DESCRIPTION = "This package includes the documentation for texlive-isorot"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-isorot-doc-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "aa67e0b47e72643ef35d480f72a62ee452c2961c532d3549cc1e459e55dfab2a76e9b6ad5b3cfce823bf4ca3247d8bd953a0640b0b20faaca18b484ff533877e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isorot-doc"

RDEPENDS:${PN} += ""

inherit rpm
