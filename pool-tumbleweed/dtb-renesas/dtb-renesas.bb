SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-renesas-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "bc78f0314a5d1a1fc4b31c9548a166a144a42862950a104f604c6543802a3614e5ed182a00a3cb8997706f118129af1a9ea3ab682958dddbed6bade4d18a5668"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
