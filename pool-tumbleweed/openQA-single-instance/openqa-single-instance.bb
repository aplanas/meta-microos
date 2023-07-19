SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-single-instance-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "912964b60c2edf4b391d7a559d396baec61a20015299f23b544f9aeb7a3dd9d9aafe7835c8af8ba203f162d1994090e67d3006226ab24536de4f048ea9204006"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
