SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-apple-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "b21267f46e7f4ef4e731d139489ea42fc9700bec75055ace6e029011f757feabc3fde310621f21b888a12ca58083bf31833847ada13f6a60b91f498ada962dba"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
