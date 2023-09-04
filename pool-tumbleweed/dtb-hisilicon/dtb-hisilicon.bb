SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-hisilicon-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "8f0b765e6854e8141a3e8da8f2b44d73cadafe62e6a725b33297144271f035bf9bc9c3036ff65f66605c64d6ffc2923958ef663dff7d88875a9349048bbd18b4"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
