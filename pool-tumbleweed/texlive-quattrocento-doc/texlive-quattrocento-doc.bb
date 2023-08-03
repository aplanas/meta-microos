SUMMARY = "Documentation for texlive-quattrocento"
DESCRIPTION = "This package includes the documentation for texlive-quattrocento"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64372"

RPM_NAME = "texlive-quattrocento-doc-2023.209.svn64372-54.1.noarch.rpm"
RPM_HASH = "f38a297cc4302872efea9a9d53975988eed08c98e22674be01854794a6db3ae9cd649d489682067700ba65fa992daff1d68e334be56e30af0d6586352df8bf7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quattrocento-doc"

RDEPENDS:${PN} += ""

inherit rpm
