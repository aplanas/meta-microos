SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-allwinner-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "136279fcea193bddb441ba83fec5b9e19ac506d9567d0f67f984695bcf5f47f5fa3bc20b1ee55962377344c40cb9044be38ec1f0e5241f18cd3948a0216a6381"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
