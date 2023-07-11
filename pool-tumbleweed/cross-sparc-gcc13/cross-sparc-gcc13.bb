SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparc-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "cba093764fd21e4021530b4aa2bad5b0c56df3ed64b4b90ea0bf05e9050fff0eb6722bf49a8e015797ce7b5d9c1e04d1998c0740ed2cb34bc1fe3881c94aefcb"

RPROVIDES:${PN} += "cross-sparc-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
