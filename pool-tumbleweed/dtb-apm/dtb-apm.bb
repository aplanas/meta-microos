SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-apm-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "4f0af86e558e024a0e1881b97230363b6b9edad8209d59d3730f43708211d8daf85cfe202645b8dadded80fe5c647983a656654b919508c8d72107d4c314b7a2"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
