SUMMARY = "Documentation for texlive-filecontentsdef"
DESCRIPTION = "This package includes the documentation for texlive-filecontentsdef"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn52208"

RPM_NAME = "texlive-filecontentsdef-doc-2023.209.1.5svn52208-53.1.noarch.rpm"
RPM_HASH = "dfff9472ac156e6ca77833f79214514f341d1b9ed8f321a46c0372793901590686d0331a6515820e297c12abd1e03ec945d72a19eff315604ce2c99150f30335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filecontentsdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
