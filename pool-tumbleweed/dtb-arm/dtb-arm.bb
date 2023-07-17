SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-arm-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "df60f6494d3941f62628201bff6ffb947b471f2cbb84e753f2f748acf516edc4956a4e7558feabb5b4916dff11312cd4dcef7df2aa03d571cdb74e452896cb25"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
