SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-qcom-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "75a18492ec621a4af092d7b06534676af6b220f9ce460a6c867c4a303b664c26d010ef007a61dac329879c9a387ae696595b23bae5e6ed89b2193834d3bab13f"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
