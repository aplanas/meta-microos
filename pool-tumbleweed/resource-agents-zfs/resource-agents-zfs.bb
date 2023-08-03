SUMMARY = "resource-agent for ZFS support"
DESCRIPTION = "Containing the resource agent and documentation for ZFS support"
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.12.0+git50.5c26404e"

RPM_NAME = "resource-agents-zfs-4.12.0+git50.5c26404e-1.1.aarch64.rpm"
RPM_HASH = "043c15b3600b807881f993c14d5744d14d9ec1181dd5db34e45b6de58ee6b1a3809a0c5359ccd067f35207163cfdc5f6b26424fe5c289113dc1086d2e1ff3055"

RPROVIDES:${PN} += "resource-agents-/usr/lib/ocf/resource.d/heartbeat/ZFS \
resource-agents-/usr/share/man/man7/ocf-heartbeat-ZFS.* \
resource-agents-zfs"

RDEPENDS:${PN} += "/usr/bin/sh \
resource-agents"

inherit rpm
