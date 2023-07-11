SUMMARY = "Development files for Janus Gateway plugins"
DESCRIPTION = "Janus is a general-purpose WebRTC gateway designed and developed \
by Meetecho. \
 \
This package holds the file needed to compile plugins for Janus Gateway."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "janus-gateway-devel-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "47d702bd1d4e7d0cf6b3f6317283c9cbfa37596b974fef0ba7518127b901c911c58afe249f52597f68285cde79a733cf7d489d5d995be1efcd9580ed04e8def2"

RPROVIDES:${PN} += "janus-gateway-devel"

RDEPENDS:${PN} += "janus-gateway"

inherit rpm
