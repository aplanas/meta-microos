SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-single-instance-nginx-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "e11934f714ce678740f55a127b2ecfb439dec66820096c5c177b9b84424d498964acdfd1e84c397f904cdaa87471f1ce76380db09f3b1b5b26bbf0449c3bcaa2"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
