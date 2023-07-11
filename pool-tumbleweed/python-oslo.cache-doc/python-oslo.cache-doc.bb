SUMMARY = "Documentation for the OpenStack Oslo Cache library"
DESCRIPTION = "Documentation for the OpenStack Oslo cache library."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "python-oslo.cache-doc-3.4.0-1.1.noarch.rpm"
RPM_HASH = "b79a0475225fbbb21ba244b71910c30cab02026e797d67c35b5b0ca358947073b3170ad15d56194d291df0f829a86cb62cc152c4751b6f46fe1777c23cdb55c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.cache-doc"

RDEPENDS:${PN} += ""

inherit rpm
