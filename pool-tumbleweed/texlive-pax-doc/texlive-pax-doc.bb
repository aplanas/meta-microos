SUMMARY = "Documentation for texlive-pax"
DESCRIPTION = "This package includes the documentation for texlive-pax"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63509"

RPM_NAME = "texlive-pax-doc-2023.209.svn63509-52.1.noarch.rpm"
RPM_HASH = "1860a5a61909b087025645f1f52bb841938b188696c88658f75062845935f0e003212d42f1dad0530d2afeb447c05be9ef61353969303271c94cda53a041038c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pax-doc"

RDEPENDS:${PN} += ""

inherit rpm
