SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-x86_64-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "d423dd67f0eceef9d6c3236fefd78572030300ba74afba56581cbc912090d3aab6a45bcfab27e9908b043a6e9327f1e95470b038e6307502d3915c7313e3da6f"

RPROVIDES:${PN} += "cross-x86-64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
