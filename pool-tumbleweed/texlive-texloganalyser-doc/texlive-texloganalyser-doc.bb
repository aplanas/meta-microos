SUMMARY = "Documentation for texlive-texloganalyser"
DESCRIPTION = "This package includes the documentation for texlive-texloganalyser"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.11svn54526"

RPM_NAME = "texlive-texloganalyser-doc-2023.209.0.0.11svn54526-55.1.noarch.rpm"
RPM_HASH = "4c8e9d9d9d0e591dde4a63f9bf2ffa3581b8aaecbd557bddbb41081fbab429876cdd44e637b36efba35e6b6bc084863de3f28bb912d709abbce52834eb5a0988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texloganalyser-doc"

RDEPENDS:${PN} += ""

inherit rpm
