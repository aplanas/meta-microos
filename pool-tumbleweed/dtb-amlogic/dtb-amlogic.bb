SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-amlogic-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "61641a5fa4ed5c93930f9c1916893796f492103b3f389cedee3b3a699b013a1c96667b5c8f9dbebfeb3e7310b3b5177efa1ed4e6ff109e6db026a76a86ed9a56"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
