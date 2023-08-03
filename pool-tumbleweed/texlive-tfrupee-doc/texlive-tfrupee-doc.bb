SUMMARY = "Documentation for texlive-tfrupee"
DESCRIPTION = "This package includes the documentation for texlive-tfrupee"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02svn20770"

RPM_NAME = "texlive-tfrupee-doc-2023.209.1.02svn20770-55.1.noarch.rpm"
RPM_HASH = "7f1e6366457aca33c54a291fdd385791caef5bc26c9ba190e25aa18a8cdf84556369da17e3076f122b6b8baf6a415ba859bb7189d64f03f8b8d6de05b02065c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tfrupee-doc"

RDEPENDS:${PN} += ""

inherit rpm
