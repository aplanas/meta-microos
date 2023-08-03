SUMMARY = "Documentation for texlive-gfscomplutum"
DESCRIPTION = "This package includes the documentation for texlive-gfscomplutum"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn19469"

RPM_NAME = "texlive-gfscomplutum-doc-2023.209.1.0svn19469-53.1.noarch.rpm"
RPM_HASH = "2959a2353855ad3ff35ab267952108941375fc74a7f46275d7af444b7daa8c180d9ec81d5af03bac7c7a94cab9b24089897ca75f3aafca3557af594ef368ba91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfscomplutum-doc"

RDEPENDS:${PN} += ""

inherit rpm
