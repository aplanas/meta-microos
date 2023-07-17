SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-apm-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "81a0e41e5b1e9e4a747d3d2991e5191e7a32cd18cd2cb6a55eb5d0199fa4c79bc3b0992c895e854fa4752079a93f58a3d5cdf6bccb7079d4f4fc3dd7bfb73c7d"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
