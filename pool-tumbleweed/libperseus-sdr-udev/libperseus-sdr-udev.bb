SUMMARY = "Udev rules for Perseus SDR"
DESCRIPTION = "Udev rules for Perseus SDR hardware"
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "libperseus-sdr-udev-0.8.1-1.22.aarch64.rpm"
RPM_HASH = "6c047c361be02510cbc0adcf102039dfe772e6b8a98abce68facfdc830a5ad71b9e2e4bed05e4ac68ca56f6c289e5ceba0cf8458ec5e4e7eb2b3eda22adb36a4"

RPROVIDES:${PN} += "libperseus-sdr-udev \
libperseus-sdr-udev(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
pwdutils"

inherit rpm
