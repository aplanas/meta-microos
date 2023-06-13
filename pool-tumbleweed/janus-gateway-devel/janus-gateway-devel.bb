SUMMARY = "Development files for Janus Gateway plugins"
DESCRIPTION = "Janus is a general-purpose WebRTC gateway designed and developed \
by Meetecho. \
 \
This package holds the file needed to compile plugins for Janus Gateway."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "janus-gateway-devel-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "b419d6f32f9e159d6fe19c35b12290e8bb5a7a1a59753c61ea875ff3b6719d057d10ad9938c2b3fcc3b1717693f332f0fa36accea03c78d38839c8559eee68c8"

RPROVIDES:${PN} += "janus-gateway-devel \
janus-gateway-devel(aarch-64)"

RDEPENDS:${PN} += "janus-gateway"

inherit rpm
