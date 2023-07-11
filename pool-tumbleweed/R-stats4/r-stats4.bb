SUMMARY = "Package providing R-stats4"
DESCRIPTION = "This package provides R-stats4, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-stats4-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "754672cc641e95f8d10ee2a3e9e36a83fc7106ef9b2c8ef5ec5f0902e756ddd5783f7ec2cb535e5fc7ca1d2a088269ec42d5699414b8df5a963e7c6b598d4d8d"

RPROVIDES:${PN} += "R-stats4"

RDEPENDS:${PN} += "R-base"

inherit rpm
