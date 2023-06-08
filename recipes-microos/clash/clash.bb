SUMMARY = "A rule-based tunnel in Go"
DESCRIPTION = "Clash is a rule-based tunnel in Go."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "clash-1.12.0-1.3.aarch64.rpm"
RPM_HASH = "5cf1b9630a3d79923076449f08a7483e9d527d9fbd7574018b5e1a0d2183503c50c2e80424ca9aa5e32d4548b01a226ccdf299f211cfd9dd0338227ae89b9ecc"

RPROVIDES:${PN} += "clash clash(aarch-64) config(clash)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
