SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-x86_64-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "d57e4f354592a346861be6aa0f964069c8253b3d9bcffffe81f71c58feeec3ea608838b7c53e9d0b5e88faaddacb5ba72f211264d8f1ce71526e515674894d05"

RPROVIDES:${PN} += "cross-x86-64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
