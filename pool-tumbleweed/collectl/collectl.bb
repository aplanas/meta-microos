SUMMARY = "System status data collection utility"
DESCRIPTION = "Similar to the 'sar' program, collectl does collection of device performance \
information. It features: \
* Fine-grained non-drifting monitoring \
* Aggregates performance numbers or device-individual reports \
* Aligned monitoring intervals \
* Process and slab monitoring \
* Monitoring of process i/o statistics \
* IPMI monitoring for fans and temperature sensors \
* API for importing additional data"
LICENSE = "Artistic-1.0 & GPL-2.0-or-later"

PV = "4.3.8"

RPM_NAME = "collectl-4.3.8-1.1.noarch.rpm"
RPM_HASH = "33ee9ff8f2bf4590b312fadd0e58f7b027ffef8e0a72db4c04fb3a77c280a8f194cb366ed50d5430c94fccffc7969859e4f56ee83bd27a7ba1c8c12e6592d60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectl \
config(collectl)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
systemd"

inherit rpm
