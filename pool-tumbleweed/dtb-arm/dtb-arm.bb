SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-arm-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "733e922b089d0c72cd5ac5f2a1ed3ab71f9c712281fac4ca868810bd9d0b5b17967ec127c345ade318e24775243f9d558aee5fe18dc3b3778bfc35b5fbc75925"

RPROVIDES:${PN} += "dtb-arm \
dtb-arm(aarch-64) \
dtb-foundation-v8 \
dtb-rtsm_ve-aemv8a \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
