SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-cavium-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "ef268551e399388c3e465d8c05ea85a1decaac60ee289e8a5845f134889d5ede607f69db62f6601bccb54c94aa9b62f8f9fb04b65e4b41538d40496850fb40d8"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
