SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-xml-2.1.0-1.2.noarch.rpm"
RPM_HASH = "fa5fcdb344d330856aef4aad83e9e802143e8605cb6969869da6ab0defb27d365797b9cd46b9feb3d3b6421ce9765b781338fd6ba391f6fb2b020d0e48e7e3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-xml"

RDEPENDS:${PN} += "python39-lxml \
python39-pandas"

inherit rpm
