SUMMARY = "Documentation for texlive-altsubsup"
DESCRIPTION = "This package includes the documentation for texlive-altsubsup"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62738"

RPM_NAME = "texlive-altsubsup-doc-2023.201.1.1svn62738-54.1.noarch.rpm"
RPM_HASH = "5231e6985f3c523df41f7ba5632c1dcba2e6f036bc6172ed90b53a63ab245fe95a08191dd95c8adc04464e3c40b99f2248608c86631572260701d554486b65f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-altsubsup-doc"

RDEPENDS:${PN} += ""

inherit rpm
