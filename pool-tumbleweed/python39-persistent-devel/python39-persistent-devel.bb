SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python39-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-persistent-devel-5.0-3.1.aarch64.rpm"
RPM_HASH = "9a9d92fdb3cdcc82a028843769e5ae26b810de7a082304a53ec95ad897c9492c450143e551e0c14ae83b1db5013779af05bf183abb6a471510958b99583322bd"

RPROVIDES:${PN} += "python39-persistent-devel"

RDEPENDS:${PN} += "python39-devel \
python39-persistent"

inherit rpm
