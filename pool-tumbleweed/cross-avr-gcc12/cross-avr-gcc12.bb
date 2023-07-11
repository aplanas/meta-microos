SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-avr-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "b48badb393feaa67e925780d20b97fbf5d2db9bfe2503befe0b9902292aa48a734cf7d409436dac4a7d085d756a4108fd25c317bce82eb620947b742b4fd4785"

RPROVIDES:${PN} += "cross-avr-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
