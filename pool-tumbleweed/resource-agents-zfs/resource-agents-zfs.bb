SUMMARY = "resource-agent for ZFS support"
DESCRIPTION = "Containing the resource agent and documentation for ZFS support"
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "resource-agents-zfs-4.12.0+git30.7fd7c8fa-1.1.aarch64.rpm"
RPM_HASH = "dfdcbbdd3a56bfd44d1b2052326a0170454dc44c125fc2248e6b419a9e98c66f203b62cbcd04d734afdbe77fe545169a509897fd99095af2b5afc5bb1c40c851"

RPROVIDES:${PN} += "resource-agents-/usr/lib/ocf/resource.d/heartbeat/ZFS \
resource-agents-/usr/share/man/man7/ocf-heartbeat-ZFS.* \
resource-agents-zfs"

RDEPENDS:${PN} += "/usr/bin/sh \
resource-agents"

inherit rpm
