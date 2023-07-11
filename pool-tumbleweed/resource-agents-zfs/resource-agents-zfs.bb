SUMMARY = "resource-agent for ZFS support"
DESCRIPTION = "Containing the resource agent and documentation for ZFS support"
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "resource-agents-zfs-4.12.0+git30.7fd7c8fa-1.2.aarch64.rpm"
RPM_HASH = "84bf4d45826c16b251c798019b8337f1b75c8c238d0636eac19ccb4d3ca054c79ce7a61e593f1136a7d310c8db3e0f2e101556d226ecffd74ab50025052d2554"

RPROVIDES:${PN} += "resource-agents-/usr/lib/ocf/resource.d/heartbeat/ZFS \
resource-agents-/usr/share/man/man7/ocf-heartbeat-ZFS.* \
resource-agents-zfs"

RDEPENDS:${PN} += "/usr/bin/sh \
resource-agents"

inherit rpm
