SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64le-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "86a6375e0196e4d3dec9b521a6ce3c87e27f45381df68fe4a18712dcf684f8d6251e7276eb534d2c4c1707639287f6a2c39210794686ebcf16000f938f24796a"

RPROVIDES:${PN} += "cross-ppc64le-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
