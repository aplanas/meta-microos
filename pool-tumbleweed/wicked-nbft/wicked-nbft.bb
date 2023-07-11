SUMMARY = "Network configuration infrastructure - nbft support"
DESCRIPTION = "This package provides an extension to retrieve the NBFT firmware \
network interface configuration according to the NVM Express Boot \
Specification 1.0 and convert it to wicked configuration."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.73"

RPM_NAME = "wicked-nbft-0.6.73-2.1.aarch64.rpm"
RPM_HASH = "89ac6d6ae4aec91845d0365437cda411d598719c1efd2c1f29d7d8f2e7284e6a6e6f9b39a53c52910ff49f2a4f780c00588d406069560b43aff2db9c3a63fbf0"

RPROVIDES:${PN} += "config-wicked-nbft \
wicked-nbft"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
jq \
nvme-cli \
wicked"

inherit rpm
