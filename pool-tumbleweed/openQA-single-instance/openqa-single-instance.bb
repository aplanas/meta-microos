SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-single-instance-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "165a3270146d398a7a8903f84e18c0b4b60969b738f90db43345d9b91078f15b141dee98b6589e8c96bc1ca939f48b7fcb076ae9c8fd887ebc68bea662a0275c"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
