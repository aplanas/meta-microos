SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-single-instance-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "d839410ea9a91e56b12760b34c8ab1abcae856596e3488ac7b8e59442736519c375467cea75295100d226e1cf4a7b5e9d3244444491c721d932162583da6d716"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
