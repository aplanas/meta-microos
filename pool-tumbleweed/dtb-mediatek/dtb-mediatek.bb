SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-mediatek-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "ad37f942aac72c3322f54b45a109f6ba3659a9aaa2eb96d2fcfb85438e54374be10f8b41995720ae378ea79e48de7a76ba0f5b2ba69fc1a72856182b27031634"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
