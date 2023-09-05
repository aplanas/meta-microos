SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-amazon-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "1c9a135acc1618f7d8979e4c6ea267e49880ef47c25a649f57d5b81a018c2586251e0100661c1812fba948ce126d41e784c00c705efbcb3eef80dcc957d4fdfd"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
