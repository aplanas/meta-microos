SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides agents suitable only for \
development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.12.1+git.1682325255.86f77326"

RPM_NAME = "fence-agents-devel-4.12.1+git.1682325255.86f77326-1.1.aarch64.rpm"
RPM_HASH = "d3e02abd163e0a2d7ce1c70d749fcff6a3ec9eff7db0d176bd240abadf17dd7086894f2d489a855b0b1e933a0f54594c5cced64bb460b9530bf8c033011783b8"

RPROVIDES:${PN} += "fence-agents-devel fence-agents-devel(aarch-64) pkgconfig(fence-agents)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 fence-agents"

inherit rpm
