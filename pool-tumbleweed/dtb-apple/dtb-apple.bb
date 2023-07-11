SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-apple-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "6ed11a9a0200b9cd4b9412fcd5deb75e5824351cb32477caa87416470e385ba3357466377c4f9087160a1468783d07b04036bd88e0af88e6e740f00b95508e06"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
