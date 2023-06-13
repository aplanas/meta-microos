SUMMARY = "Data files for lalinference"
DESCRIPTION = "This package provides the data files for lalinference."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "lalinference-data-4.0.0-1.2.noarch.rpm"
RPM_HASH = "59a17e87f31b87d3cfd9d736403dc5bb58dea1581b5c1926eb7844cdcfb7e13ce41c196bd57cfb1d54f6f5ec72933d9fbaa477329e1ac706d505871217193c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lalinference-data \
python310-lalinference-data \
python38-lalinference-data \
python39-lalinference-data"

RDEPENDS:${PN} += ""

inherit rpm
