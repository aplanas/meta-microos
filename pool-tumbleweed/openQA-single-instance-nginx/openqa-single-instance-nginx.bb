SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-single-instance-nginx-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "9afa51458df89640d2e3bcf3ff25697465432f467df82d913ba47eb2f4ee2aac11c7dfe4b016c24ba798a7f9df6abd0033c2c83eeefc1bc4f790a9daff18fc18"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
