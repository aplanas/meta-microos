SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "libmetrics-devel-1.1-5.6.aarch64.rpm"
RPM_HASH = "6a3388e6f6332b9240539fecfde60defc3b5d0d4e26b8f1f85c00e0b684e39ebdf359890005ea0d4ffebfb3da2be3abd0083edec8ae766e4235f54dd7848277a"

RPROVIDES:${PN} += "libmetrics-devel"

RDEPENDS:${PN} += "libmetrics0"

inherit rpm
