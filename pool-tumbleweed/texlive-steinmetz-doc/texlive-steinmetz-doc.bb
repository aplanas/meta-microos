SUMMARY = "Documentation for texlive-steinmetz"
DESCRIPTION = "This package includes the documentation for texlive-steinmetz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-steinmetz-doc-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "6e248b40e9aafad25a949cf8fde5c69deeb6a993cf4bb072820734834e682e02b37349757b45e21d9312e1b66b0ac3a3794512133f1eba0d0916572f2c6a55ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-steinmetz-doc"

RDEPENDS:${PN} += ""

inherit rpm
