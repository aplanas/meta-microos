SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-amazon-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "9798c78229b535c5e68464350ad573aed0ac14807e63f6c024ed8d7931faf53eb6ef64de1628f61c5ad45762895122a40799afdf37b3f21ab883ccf296e08c99"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
