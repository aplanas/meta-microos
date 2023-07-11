SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-hppa-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "ed39a324a7b2a690bad1584d1ec10413e6276b51b9be4f51d28db7ebf31eed92b0e083867a928923a7a6f57d12df2f77e6b18f5f295e2f644ce0307e390b1018"

RPROVIDES:${PN} += "cross-hppa-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
