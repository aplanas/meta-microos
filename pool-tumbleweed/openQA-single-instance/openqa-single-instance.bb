SUMMARY = "Convenience package for a single-instance setup"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-single-instance-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "9390535d985905289e6853077c0b3090dc49c63dda5d3e5118be351baeeaa7a9dc723c93bc3ecc84cd17aae0d0bd31f59762941557d0d3b1fd245e216284210e"

RPROVIDES:${PN} += "openQA-single-instance"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
