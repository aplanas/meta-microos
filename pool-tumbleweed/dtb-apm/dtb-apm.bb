SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-apm-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "2172f2e988c15af9c2596416f3a86a441a4ed360d2eab8f93eaaae885cf990deb1aafddcc49d07c83219f1dedef8684793f09fce2d8acfcbbe578bfec65f8a5f"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
