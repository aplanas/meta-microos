SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.618.aarch64.rpm"
RPM_HASH = "f849f3d9afe6f3f2b52058b6e409dcc9de072dee9d2f5228770be0b638c12302742cc15dcd5446528efacb4f03b52438e88d3f8a2e03b0ab5c41458cb8c86c20"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
