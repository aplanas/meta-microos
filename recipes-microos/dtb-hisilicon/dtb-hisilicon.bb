SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-hisilicon-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "6866e225aa35850a544751d807c64ed60eb20b5b10588076e67d3923a774106984fc701972bcafc2a4ebde6fbd1bea8f4d357750c5199f1952e91df922c6755b"

RPROVIDES:${PN} += "dtb-hisilicon dtb-hisilicon(aarch-64) dtb-hisilicon64 multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
