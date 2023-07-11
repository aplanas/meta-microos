SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-qcom-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "e84177d9c3eeab257106b2999d5dfab1e2a436a401160a05815559aa2b8d286633b14743d4b728df109129b7f1c9bdf43389b0ebb2d3be1ebda06eda2555afa0"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
