SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-allwinner-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "88adcc3d6ca2e1324f67df0c440406d771452fe1e7a27eac5bedbe77b805494bd3c8937b5d920e51ca08722ee85c75fb8d58ec5a65d61bd779987f2f020f9983"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
