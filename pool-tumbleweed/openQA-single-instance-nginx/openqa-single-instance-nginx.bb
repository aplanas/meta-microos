SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-single-instance-nginx-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "8a56a8136a55b118bdf1fd77383c7a1fc7a90da8d3714536b6c84ba7d8cd0e732aa05a331bb193054050f6f621558c049de8e1f0c713ca73720b2696b334f11c"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
