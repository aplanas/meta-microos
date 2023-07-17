SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-hisilicon-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "a34609aa5e2a67ed84b8fc3069e36c73bc8896693b3453e690d2087beca2ab33be2c6c9bd7d911f426e58fb662bb73d31bead798358fd3ecbcda25cceafd87cb"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
