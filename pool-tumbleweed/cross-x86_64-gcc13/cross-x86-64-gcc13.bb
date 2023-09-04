SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-x86_64-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "f19b98aa40db721494f1bfc31ff914afb9c5652bf14af36844ba04cfd986a66520453727cd450c8d4f6fb520648d6e85adbf72549131bf5947d2e4de0ff4208a"

RPROVIDES:${PN} += "cross-x86-64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
