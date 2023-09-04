SUMMARY = "Documentation for texlive-youngtab"
DESCRIPTION = "This package includes the documentation for texlive-youngtab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56500"

RPM_NAME = "texlive-youngtab-doc-2023.209.1.1svn56500-53.2.noarch.rpm"
RPM_HASH = "8be849954060280ee4c91555f35752750c05114939742d64833e9877b7540b9ae8083d12860c47b1d6d1f67ab9ce12d3c5ae56af965dceb5686ebc648baa4369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-youngtab-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
