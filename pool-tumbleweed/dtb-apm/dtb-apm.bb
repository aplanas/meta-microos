SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-apm-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "714987e2942760a332f1107d5cbe482b0a58cf7cb9027afd6ae4993ff52185a2d803c5c63c28c97c26e2da2802d6c85ba6d8a3b73b51e8072094396717701c6e"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
