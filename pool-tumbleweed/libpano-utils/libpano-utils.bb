SUMMARY = "Panorama Tools Utilities"
DESCRIPTION = "Utilities for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.21"

RPM_NAME = "libpano-utils-2.9.21-1.9.aarch64.rpm"
RPM_HASH = "8a3a85925ad4535e86f0c9d3f364f5a16aa425c24d794e8d12a369463c90d1afa799b58e6be21e16b16172c3a0247433cc4e3958344ec770e99870084c02438f"

RPROVIDES:${PN} += "libpano-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpano13.so.3"

inherit rpm
