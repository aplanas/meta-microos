SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides agents suitable only for \
development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.12.1+git.1690196437.64f62dbb"

RPM_NAME = "fence-agents-devel-4.12.1+git.1690196437.64f62dbb-1.1.aarch64.rpm"
RPM_HASH = "9f49ddefe7a14ad8552498c1e93c2f5afe0f9143fbf6e7533ea6389a4b488863f5ee55ab72d0f48594429e23aaedb720d2b56174b9c610136c1d47d3dfa4a998"

RPROVIDES:${PN} += "fence-agents-devel \
pkgconfig-fence-agents"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
fence-agents"

inherit rpm
