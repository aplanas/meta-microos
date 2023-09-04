SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-hppa-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "b699b57d421ca4a7de55ff3376b7f86a982d4454437da251124ec332c6ccf79b0f23f07ddc8d2da1e849f4fbf66a9daca4bd5df36c8e80d4fb5bcde41001679c"

RPROVIDES:${PN} += "cross-hppa-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
