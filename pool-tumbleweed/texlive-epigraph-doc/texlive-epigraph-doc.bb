SUMMARY = "Documentation for texlive-epigraph"
DESCRIPTION = "This package includes the documentation for texlive-epigraph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn54857"

RPM_NAME = "texlive-epigraph-doc-2023.209.1.5esvn54857-54.1.noarch.rpm"
RPM_HASH = "5391effc9c417e90fe908a8727718e363068dca3a3388cbd257ff93ae00210c69553e94f4da9c3ba2763b092cd10c49587627410ccab129912d6d6d151eaf747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
