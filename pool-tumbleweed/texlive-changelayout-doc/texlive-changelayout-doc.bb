SUMMARY = "Documentation for texlive-changelayout"
DESCRIPTION = "This package includes the documentation for texlive-changelayout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16094"

RPM_NAME = "texlive-changelayout-doc-2023.209.1.0svn16094-53.1.noarch.rpm"
RPM_HASH = "6d2775a750d8911bde7ef98aacdd5b27975383696a69d4ac59edcc43e8463a13abbdcae1e3f6a52d9857ee50e52103406e3b94efb282d86bfdce1508dd15b04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
