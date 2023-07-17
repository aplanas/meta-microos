SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-m68k-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "c1edfd9afe6bc5e3314a9b165e0e00f353cf0a47ff208811409bb9b5fa450df6459d515507c4b066765bb168609009467fe1ce3d061bb0fa07559e10ba6261f3"

RPROVIDES:${PN} += "cross-m68k-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
