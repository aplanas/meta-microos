SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-lg-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "9c537d376850f01d4cb5ae7987a088b528a77b5c7ea7fe444356071faf2a21132cfd55e7c3b014b41cffe17de6ff1217beecbb46e80a1442899ee001ba3fa312"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
