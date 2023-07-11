SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-pru-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "0b144e5c19ebca8eb0b8f24a48109a63a765331bdccf3cde2c78c239c7797b68b5f079968058d900e9a201b0e65af05f5654e2a650d81a512308665a5e3c4273"

RPROVIDES:${PN} += "cross-pru-gcc12 \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
