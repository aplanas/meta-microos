SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-broadcom-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "ef267772090b343e4f020d58c6fe91c880326712978aa3eed59375086bf122f891749a35e3f88e241da3974051f1f552747110fbf1b08d68b478aa7fec6fddfa"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
