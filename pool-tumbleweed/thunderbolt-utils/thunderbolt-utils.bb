SUMMARY = "User-space utilities for Thunderbolt/USB4"
DESCRIPTION = "This software is a collection of various user-space functionalities \
for the thunderbolt/USB4 subsystem."
LICENSE = "LGPL-2.0 & GPL-2.0"

PV = "0.1~rc1"

RPM_NAME = "thunderbolt-utils-0.1~rc1-1.1.aarch64.rpm"
RPM_HASH = "5070e43a3f9aec4a2a420e39e91842e9c6dd73a07e558742c656535e1bf45b751d5f52adc103490be1f9de43b9aff67f198817afea7425c3e58928b6834dd4bc"

RPROVIDES:${PN} += "thunderbolt-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
