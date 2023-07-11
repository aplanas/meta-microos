SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-m68k-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "b8feb21d99d157542dbbe116da20a10336afc694a2f3c3ad020762867408bd4f6849f52eb0cc49f6c4f3a47ff8f4b674fe33bd0fbb8ca841a64f08203c49e4e6"

RPROVIDES:${PN} += "cross-m68k-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
