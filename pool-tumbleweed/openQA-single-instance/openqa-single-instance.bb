SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-single-instance-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "32b60d7281b52afc059037585608457c0302ea7e32e370780fcaf54a18ba248bfe2628ca16ce4aec2daa60e41903e4a2d567abecd9973dd78c8371e251f5b882"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
