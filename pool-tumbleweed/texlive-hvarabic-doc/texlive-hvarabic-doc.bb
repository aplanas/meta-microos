SUMMARY = "Documentation for texlive-hvarabic"
DESCRIPTION = "This package includes the documentation for texlive-hvarabic"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.02svn59423"

RPM_NAME = "texlive-hvarabic-doc-2023.208.0.0.02svn59423-53.1.noarch.rpm"
RPM_HASH = "7e48bcf6ad0ec85a95cda370af11272c8fe17051984b36f38e2bd49c99076614bd185afe167b330708c9e3289630262a533ccfc214f1b72a9dcebaa23646a30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvarabic-doc"

RDEPENDS:${PN} += ""

inherit rpm
