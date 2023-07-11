SUMMARY = "Documentation for texlive-gridset"
DESCRIPTION = "This package includes the documentation for texlive-gridset"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn53762"

RPM_NAME = "texlive-gridset-doc-2023.201.0.0.3svn53762-53.2.noarch.rpm"
RPM_HASH = "79f4a7ead53128d5eb401deeba959cd18e4abba3f620e62584de05957788ef244df526c67280f522a0b0e9390ee01b55b7ca681b1b351eda324b23037e546907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridset-doc"

RDEPENDS:${PN} += ""

inherit rpm
