SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-qcom-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "9c476b0bf62e0fc6838685159c5ea552987ec7931dd03197473b3624f46bead13561e1ff79105db3bf05d147602be8f5b5fc500c1198ab89547b229ebd8bc2f5"

RPROVIDES:${PN} += "dtb-qcom \
dtb-qcom(aarch-64) \
multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
