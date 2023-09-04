SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-qcom-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "3739a3ef77c65cd3123a75e831b89a81cab60f7703bdd3535b3926a00be55c0e612f98eccbc591957be8d3786eed6640ecc75337e3fbb2d365bd32b61de231aa"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
