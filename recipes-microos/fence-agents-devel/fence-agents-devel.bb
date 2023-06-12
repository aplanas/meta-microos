SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides agents suitable only for \
development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.12.1+git.1682325255.86f77326"

RPM_NAME = "fence-agents-devel-4.12.1+git.1682325255.86f77326-2.1.aarch64.rpm"
RPM_HASH = "0789f6ae80cd6247dadcae142d9e20c7f05b44c0649e1224b0af404fab375130a5afcde96bd07f676aa2a1a2029dae3d4b10cc0dcc5c5a96024476963776e1fc"

RPROVIDES:${PN} += "fence-agents-devel fence-agents-devel(aarch-64) pkgconfig(fence-agents)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 fence-agents"

inherit rpm
