SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-lg-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "d8b556786ec200310d515d4b47005ae78a8500fe546bc1bf7c405ee7737d38a57ba8245d4e9fd42573608129b0ba4a774ec169cfaabb373339af2327d96cd13e"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
