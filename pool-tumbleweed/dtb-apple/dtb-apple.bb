SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-apple-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "48688620088540ace2fe35e5aac283c82f170eb672bccf1f76ed5f60d7619cc332307919320ff6e30ccc0489003c35c30d57ade0225781750c15109f354c129a"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
