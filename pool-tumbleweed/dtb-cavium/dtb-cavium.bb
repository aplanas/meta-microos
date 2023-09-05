SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-cavium-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "9655a55ad8e028ff03fa0bb5ee5d26d83fc635cab992f30071cae006e60b492702f33ebe2c5e64738f048efe1151753eff64ca487b0381ba71278c418249fb7c"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
