SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-apm-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "1c295b4df83f89e0c2bb40022478d4988fed6edf1d7ec691728d2d500d01dd69a7a4b1be427605d11d6efeca0f4f27f4cdcfeaefddbdc48a295a4260db748c4a"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
