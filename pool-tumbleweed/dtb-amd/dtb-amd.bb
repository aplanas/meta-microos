SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-amd-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "443f23f0bb499d098c189ca6933978efe2c9b7243b96ad258c9f3ba0f83ff9cec0fc7269ffc079e0316705bfefc08fe91d79ad0a2e469601b25980deda5e2adf"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
