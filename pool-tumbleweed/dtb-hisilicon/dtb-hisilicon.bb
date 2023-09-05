SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-hisilicon-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "2babe7b32265105e8ab1f121fdc9d2a768c0d5a5787ed2de648ad2ea086bd92d6c3ddae01d1b0ad07381fbed24b9eca965d25138116921c6cb3c3a5350486d9b"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
