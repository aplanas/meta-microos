SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-hppa-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "e9e6342c20fc16ecdf4ab778f3ef68d01dde45313f3aec2137ad8480c2a952c6cc6be64ecdcdf002832a6bf4a0301a8d0f5234ab98c13008de19a19affbab7c5"

RPROVIDES:${PN} += "cross-hppa-gcc13"

RDEPENDS:${PN} += "/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
