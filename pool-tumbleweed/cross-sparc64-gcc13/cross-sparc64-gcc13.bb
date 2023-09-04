SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparc64-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "55bd4969640ef2b43db66a5463d6f406ae779cc5fc1f9301ca0194c2d3d8e1cdf6813d8bcfd23ed3c8a6be578885482049a861a2d1ed1eb2d7ebefb4dbcdee42"

RPROVIDES:${PN} += "cross-sparc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
