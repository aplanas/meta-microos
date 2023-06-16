SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-hisilicon-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "3e6f0b7a33f37567d473972cd0b5d00a66251a769597a659967d9d038ca5864cc18784d4dc0be51904e4b393e10c77d56afda3446fb0f62034a93e8d8634c524"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
