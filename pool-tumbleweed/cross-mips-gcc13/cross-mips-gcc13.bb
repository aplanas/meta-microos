SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-mips-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "d558b31c876173ddc5151ab57bc22fa89fde155d075c0547023d0ea1c1582b396ff0827ca5f83377afc0ac5c9fd43456b90cdf9ce3c80002913b04a95003d11d"

RPROVIDES:${PN} += "cross-mips-gcc13 \
cross-mips-gcc13(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
